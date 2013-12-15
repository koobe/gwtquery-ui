package gwtquery.samples.client.droppables;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.plugins.ui.interactions.Droppable;

import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.Function;

public class VisualFeedback extends AbstractDroppableDemo {

  public VisualFeedback() {
    super("VisualFeedback");
  }

  public String getName() {
    return "Visual feedback";
  }

  public void setupDemoElement(Element demo) {
    $("#draggable").as(Ui).draggable();
    $("#droppable").as(Ui).droppable(Droppable.Options.create().accept("#draggable").hoverClass("ui-state-active"))//
    .bind(Droppable.Event.drop, new Function() {
      @Override
      public void f(Element e) {
        $(e).addClass("ui-state-highlight").find("p").html("Dropped!");
      }
    });

    $("#draggable2").as(Ui).draggable();
    $("#droppable2").as(Ui).droppable(Droppable.Options.create().accept("#draggable2").activeClass("ui-state-hover"))//
    .bind(Droppable.Event.drop, new Function() {
      @Override
      public void f(Element e) {
        $(e).addClass("ui-state-highlight").find("p").html("Dropped!");
      }
    });
  }
}
