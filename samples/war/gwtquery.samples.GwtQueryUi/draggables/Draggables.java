package gwtquery.samples.client.draggables;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;

import com.google.gwt.dom.client.Element;

public class Draggables extends AbstractDraggableDemo {

  public Draggables() {
    super("Draggables");
  }

  public String getName() {
    return "Default Functionality";
  }

  public void setupDemoElement(Element demo) {
    $("#draggable", demo).as(Ui).draggable();
  }
}
