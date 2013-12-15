package gwtquery.samples.client.datepickers;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.plugins.ui.widgets.Datepicker;

import com.google.gwt.dom.client.Element;

public class RestrictRange extends AbstractDatepickerDemo {

  public RestrictRange() {
    super("RestrictRange");
  }

  public String getName() {
    return "Restrict date range";
  }

  public void setupDemoElement(Element demo) {
    // TODO: minDate(Number) seems broken in 1.9m2
    $("#datepicker", demo).as(Ui).datepicker(Datepicker.Options.create().minDate("-20").maxDate("+1M +10D"));
  }
}
