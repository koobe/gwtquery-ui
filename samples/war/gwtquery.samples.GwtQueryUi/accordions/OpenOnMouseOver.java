package gwtquery.samples.client.accordions;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.plugins.ui.widgets.Accordion;

import com.google.gwt.dom.client.Element;

public class OpenOnMouseOver extends AbstractAccordionDemo {

  public OpenOnMouseOver() {
    super("OpenOnMouseOver");
  }

  public String getName() {
    return "Open on mouseover";
  }

  public void setupDemoElement(final Element demo) {
    $("#accordion", demo).as(Ui).accordion(Accordion.Options.create().event("mouseover"));
  }
}
