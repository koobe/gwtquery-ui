package gwtquery.samples.client.accordions;

import gwtquery.samples.client.DemoPanel;

import com.google.gwt.user.client.ui.HasWidgets;

public class AccordionSamples extends DemoPanel {

  public AccordionSamples(HasWidgets demo) {
    super("Accordions", demo, new Accordions(), new FillSpace(), new NoAutoHeight(), new CollapseContent(), new OpenOnMouseOver(), new CustomizeIcons(), new Sortable());
  }
}
