package gwtquery.samples.client.datepickers;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;

import com.google.gwt.dom.client.Element;

public class Datepickers extends AbstractDatepickerDemo {

  public Datepickers() {
    super("Datepickers");
  }

  public String getName() {
    return "Default Functionality";
  }

  public void setupDemoElement(Element demo) {
    $("#datepicker", demo).as(Ui).datepicker();
  }
}
