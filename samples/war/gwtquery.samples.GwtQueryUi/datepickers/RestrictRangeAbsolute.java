package gwtquery.samples.client.datepickers;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.plugins.ui.widgets.Datepicker;

import com.google.gwt.core.client.JsDate;
import com.google.gwt.dom.client.Element;

public class RestrictRangeAbsolute extends AbstractDatepickerDemo {

  public RestrictRangeAbsolute() {
    super("RestrictRangeAbsolute");
  }

  public String getName() {
    return "Restrict date range using absolute dates";
  }

  public void setupDemoElement(Element demo) {
    $("#datepicker", demo).as(Ui).datepicker(Datepicker.Options.create().defaultDate(JsDate.create(1980, 05, 21)).minDate(JsDate.create(1977, 05, 25)).maxDate(JsDate.create(1983, 05, 25)));
  }
}
