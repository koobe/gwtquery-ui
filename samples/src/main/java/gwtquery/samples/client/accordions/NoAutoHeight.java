package gwtquery.samples.client.accordions;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.plugins.ui.widgets.Accordion;

import com.google.gwt.dom.client.Element;

public class NoAutoHeight extends AbstractAccordionDemo {

  public NoAutoHeight() {
    super("NoAutoHeight");
  }

  public String getName() {
    return "No Auto Height";
  }

  public void setupDemoElement(final Element demo) {
    $("#accordion", demo).as(Ui).accordion(Accordion.Options.create().autoHeight(false).navigation(true));
  }
}
