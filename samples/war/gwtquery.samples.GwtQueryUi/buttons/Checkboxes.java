package gwtquery.samples.client.buttons;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;

import com.google.gwt.dom.client.Element;

public class Checkboxes extends AbstractButtonDemo {

  public Checkboxes() {
    super("Checkboxes");
  }

  public String getName() {
    return "Checkboxes";
  }

  public void setupDemoElement(Element demo) {
    $("#check", demo).as(Ui).button();
    $("#format", demo).as(Ui).buttonset();
  }

}
