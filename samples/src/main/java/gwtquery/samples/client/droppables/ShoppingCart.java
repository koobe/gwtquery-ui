package gwtquery.samples.client.droppables;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.plugins.ui.interactions.Droppable;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.Function;
import com.google.gwt.user.client.Event;

public class ShoppingCart extends AbstractDroppableDemo {

  public ShoppingCart() {
    super("ShoppingCart");
  }

  public String getName() {
    return "Shopping Cart";
  }

  public void setupDemoElement(Element demo) {

    $("#catalog").as(Ui).accordion();
    $("#catalog li").as(Ui).draggable("{appendTo: 'body', helper: 'clone'}");
    $("#cart ol").as(Ui).droppable(Droppable.Options.create()//
    .activeClass("ui-state-default")//
    .hoverClass("ui-state-hover")//
    .accept(":not(.ui-sortable-helper)")).bind(Droppable.Event.drop, new Function() {
      public boolean f(Event e, Object ui) {
        Droppable.Event dropevent = (Droppable.Event) ui;
        $(e).find(".placeholder").remove();
        $("<li></li>").text($(dropevent.draggable()).text()).appendTo($(e));
        return false;
      }
    }).as(Ui).sortable("{items: 'li:not(.placeholder)'}");

    // TODO add this when sortable events are implemented:
    /*
     * sort: function() { // gets added unintentionally by droppable interacting with sortable // using
     * connectWithSortable fixes this, but doesn't allow you to customize active/hoverClass options
     * $(this).removeClass("ui-state-default"); }
     */

  }

  public native final String stringify(JavaScriptObject o) /*-{
                                                           return JSON.stringify(o);
                                                           }-*/;

}
