package gwtquery.samples.client.progressbars;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;

import com.google.gwt.dom.client.Element;

public class Resizable extends AbstractProgressbarDemo {

  public Resizable() {
    super("Resizable");
  }

  public String getName() {
    return "Resizable";
  }

  public void setupDemoElement(Element demo) {
    $("#progressbar").as(Ui).progressbar("{value: 37}");
    $("#progressbarWrapper").as(Ui).resizable();

  }
}
