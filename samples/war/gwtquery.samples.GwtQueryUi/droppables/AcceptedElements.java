package gwtquery.samples.client.droppables;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.plugins.ui.interactions.Droppable;

import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.Function;

public class AcceptedElements extends AbstractDroppableDemo {

  public AcceptedElements() {
    super("AcceptedElements");
  }

  public String getName() {
    return "Accepted Elements";
  }

  public void setupDemoElement(Element demo) {
    $("#draggable, #draggable-nonvalid").as(Ui).draggable();
    $("#droppable").as(Ui).droppable(Droppable.Options.create().accept("#draggable").activeClass("ui-state-hover").hoverClass("ui-state-active"))//
    .bind(Droppable.Event.drop, new Function() {
      @Override
      public void f(Element e) {
        $(e).addClass("ui-state-highlight").find("p").html("Dropped!");
      }
    });

  }
}
