package gwtquery.samples.client.datepickers;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.plugins.ui.widgets.Datepicker;

import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.Function;
import com.google.gwt.user.client.Event;

public class Format extends AbstractDatepickerDemo {

  public Format() {
    super("Format");
  }

  public String getName() {
    return "Format date";
  }

  public void setupDemoElement(Element demo) {
    $("#datepicker", demo).as(Ui).datepicker();
    $("#format").change(new Function() {
      @Override
      public boolean f(Event e) {
        $("#datepicker").as(Ui).datepicker().option(Datepicker.Options.create().dateFormat($(e).val()));
        return false;
      }
    });
  }
}
