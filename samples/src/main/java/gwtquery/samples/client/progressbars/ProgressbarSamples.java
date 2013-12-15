package gwtquery.samples.client.progressbars;

import gwtquery.samples.client.DemoPanel;

import com.google.gwt.user.client.ui.HasWidgets;

public class ProgressbarSamples extends DemoPanel {

  public ProgressbarSamples(HasWidgets demo) {
    super("Progressbars", demo, new Progressbars(), new Animated(), new Resizable());
  }
}
