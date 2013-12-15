package gwtquery.samples.client.buttons;

import gwtquery.samples.client.DemoPanel;

import com.google.gwt.user.client.ui.HasWidgets;

public class ButtonSamples extends DemoPanel {

  public ButtonSamples(HasWidgets demo) {
    super("Buttons", demo, new Buttons(), new Radios(), new Checkboxes(), new Icons());
  }
}
