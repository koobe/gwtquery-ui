package gwtquery.samples.client.sliders;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.plugins.ui.widgets.Slider;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.Function;
import com.google.gwt.user.client.Event;

public class RangeSlider extends AbstractSliderDemo {

  public RangeSlider() {
    super("RangeSlider");
  }

  public String getName() {
    return "Range slider";
  }

  public void setupDemoElement(Element demo) {

    $("#slider-range").as(Ui).slider(Slider.Options.create().range(true).min(0).max(500).values(75, 300)).bind(Slider.Event.slide, new Function() {
      @Override
      public boolean f(Event e, Object data) {
        Slider.Event slideEvent = ((JavaScriptObject) data).cast();
        $("#amount").val("$" + slideEvent.intValues().get(0) + " - $" + slideEvent.intValues().get(1));
        return false;
      }
    });
    $("#amount").val("$" + $("#slider-range").as(Ui).slider().intValues(0) + " - $" + $("#slider-range").as(Ui).slider().intValues(1));
  }
}
