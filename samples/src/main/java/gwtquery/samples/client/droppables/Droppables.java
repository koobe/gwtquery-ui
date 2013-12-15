package gwtquery.samples.client.droppables;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.plugins.ui.interactions.Droppable;

import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.Function;

public class Droppables extends AbstractDroppableDemo {

  public Droppables() {
    super("Droppables");
  }

  public String getName() {
    return "Default Functionality";
  }

  public void setupDemoElement(Element demo) {
    $("#draggable").as(Ui).draggable();
    $("#droppable").as(Ui).droppable().bind(Droppable.Event.drop, new Function() {
      @Override
      public void f(Element e) {
        $(e).addClass("ui-state-highlight").find("p").html("Dropped!");
      }
    });

  }
}
