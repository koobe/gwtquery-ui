package gwtquery.samples.client.buttons;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;

import com.google.gwt.dom.client.Element;

public class Radios extends AbstractButtonDemo {

  public Radios() {
    super("Radios");
  }

  public String getName() {
    return "Radios";
  }

  public void setupDemoElement(Element demo) {
    $("#radio", demo).as(Ui).buttonset();
  }
}
