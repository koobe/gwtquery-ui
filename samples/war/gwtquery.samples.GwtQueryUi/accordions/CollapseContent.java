package gwtquery.samples.client.accordions;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.plugins.ui.widgets.Accordion;

import com.google.gwt.dom.client.Element;

public class CollapseContent extends AbstractAccordionDemo {

  public CollapseContent() {
    super("CollapseContent");
  }

  public String getName() {
    return "Collapse Content";
  }

  public void setupDemoElement(final Element demo) {
    $("#accordion", demo).as(Ui).accordion(Accordion.Options.create().collapsible(true));
  }
}
