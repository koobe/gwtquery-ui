package gwtquery.samples.client.droppables;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.plugins.ui.interactions.Droppable;

import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.Function;

public class Revert extends AbstractDroppableDemo {

  public Revert() {
    super("Revert");
  }

  public String getName() {
    return "Revert draggable position";
  }

  public void setupDemoElement(Element demo) {
    $("#draggable").as(Ui).draggable("{revert: 'valid'}");
    $("#draggable2").as(Ui).draggable("{revert: 'invalid'}");

    $("#droppable").as(Ui).droppable(Droppable.Options.create().activeClass("ui-state-hover").hoverClass("ui-state-active"))//
    .bind(Droppable.Event.drop, new Function() {
      @Override
      public void f(Element e) {
        $(e).addClass("ui-state-highlight").find("p").html("Dropped!");
      }
    });
  }
}
