package gwtquery.samples.client.sliders;

import gwtquery.samples.client.DemoPanel;

import com.google.gwt.user.client.ui.HasWidgets;

public class SliderSamples extends DemoPanel {

  public SliderSamples(HasWidgets demo) {
    super("Sliders", demo, new Sliders(), new SnapToIncrement(), new RangeSlider());
  }
}
