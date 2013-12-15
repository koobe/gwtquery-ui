package gwtquery.samples.client.progressbars;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;

import com.google.gwt.dom.client.Element;

public class Animated extends AbstractProgressbarDemo {

  public Animated() {
    super("Animated");
  }

  public String getName() {
    return "Animated";
  }

  public void setupDemoElement(Element demo) {
    $("#progressbar", demo).as(Ui).progressbar("{value:59}");
  }
}
