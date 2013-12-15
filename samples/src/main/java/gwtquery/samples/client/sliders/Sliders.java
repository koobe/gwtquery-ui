package gwtquery.samples.client.sliders;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;

import com.google.gwt.dom.client.Element;

public class Sliders extends AbstractSliderDemo {

  public Sliders() {
    super("Sliders");
  }

  public String getName() {
    return "Default Functionality";
  }

  public void setupDemoElement(Element demo) {
    $("#slider", demo).as(Ui).slider();
  }
}
