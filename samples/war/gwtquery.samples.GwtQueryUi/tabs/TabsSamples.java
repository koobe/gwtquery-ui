package gwtquery.samples.client.tabs;

import gwtquery.samples.client.DemoPanel;

import com.google.gwt.user.client.ui.HasWidgets;

public class TabsSamples extends DemoPanel {

  public TabsSamples(HasWidgets demo) {
    super("Tabs", demo, new Tabs(), new OpenOnMouseOver(), new Collapsible(), new Sortable(), new SimpleManipulation());
  }
}
