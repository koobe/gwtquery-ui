package gwtquery.samples.client.sliders;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.plugins.ui.widgets.Slider;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.Function;
import com.google.gwt.user.client.Event;

public class SnapToIncrement extends AbstractSliderDemo {

  public SnapToIncrement() {
    super("SnapToIncrement");
  }

  public String getName() {
    return "Snap to increments";
  }

  public void setupDemoElement(Element demo) {
    $("#slider").as(Ui).slider("{value:100, min: 0, max: 500, step: 50}").bind(Slider.Event.slide, new Function() {
      @Override
      public boolean f(Event e, Object data) {
        Slider.Event slideEvent = ((JavaScriptObject) data).cast();
        $("#amount").val("$" + slideEvent.intValue());
        return false;
      }
    });
    $("#amount").val("$" + $("#slider").as(Ui).slider().intValue());
  }
}
