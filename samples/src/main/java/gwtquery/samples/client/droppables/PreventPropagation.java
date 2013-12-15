package gwtquery.samples.client.droppables;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.plugins.ui.interactions.Droppable;

import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.Function;
import com.google.gwt.user.client.Event;

public class PreventPropagation extends AbstractDroppableDemo {

  public PreventPropagation() {
    super("PreventPropagation");
  }

  public String getName() {
    return "Prevent propagation";
  }

  public void setupDemoElement(Element demo) {
    $("#draggable").as(Ui).draggable();

    // TODO: figure out why this is not behaving like it should. Seems like all #droppables
    // are receiving the drop event regardless of where the draggable is dropped

    $("#droppable, #droppable-inner").as(Ui).droppable("{activeClass:'ui-state-hover', hoverClass:'ui-state-active'}")//
    .bind(Droppable.Event.drop, new Function() {
      @Override
      public boolean f(Event e) {
        $(e).addClass("ui-state-highlight").children("p").html("Dropped!");
        return false;
      }
    });

    $("#droppable2, #droppable2-inner").as(Ui).droppable("{greedy:true, activeClass:'ui-state-hover', hoverClass:'ui-state-active'}")//
    .bind(Droppable.Event.drop, new Function() {
      @Override
      public void f(Element e) {
        $(e).addClass("ui-state-highlight").children("p").html("Dropped!");
      }
    });
  }
}
