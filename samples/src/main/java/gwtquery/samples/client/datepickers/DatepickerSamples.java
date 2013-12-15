package gwtquery.samples.client.datepickers;

import gwtquery.samples.client.DemoPanel;

import com.google.gwt.user.client.ui.HasWidgets;

public class DatepickerSamples extends DemoPanel {

  public DatepickerSamples(HasWidgets demo) {
    super("Datepickers", demo, new Datepickers(), new Format(), new RestrictRange(), new RestrictRangeAbsolute());
  }
}
