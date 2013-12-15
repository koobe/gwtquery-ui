package gwtquery.plugins.ui.widgets;

import gwtquery.plugins.ui.Ui;
import gwtquery.plugins.ui.UiPlugin;
import gwtquery.plugins.ui.UiWidget;
import gwtquery.plugins.ui.WidgetOptions;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.core.client.JsArrayNumber;

/**
 * Implements jQuery-UI's Slider
 * 
 * TODO Implement value() and values() methods
 * 
 * @see <a href="http://docs.jquery.com/UI/Slider">jQuery-UI's Slider</a>
 * 
 * @author Philippe Laflamme
 */
public class Slider extends UiWidget<Slider, Slider.Options> {

  public static class Options extends WidgetOptions<Options> {

    protected Options() {

    }

    public static native final Options create()
    /*-{
      return {};
    }-*/;

    public native final Options animate(boolean animate)
    /*-{
      this["animate"] = animate;
      return this;
    }-*/;

    public native final boolean isAnimated()
    /*-{
      return this["animate"];
    }-*/;

    public native final Options animate(String animate)
    /*-{
      this["animate"] = animate;
      return this;
    }-*/;

    public native final String animate()
    /*-{
      return this["animate"];
    }-*/;

    public native final Options max(int max)
    /*-{
      this["max"] = max;
      return this;
    }-*/;

    public native final Options max(float max)
    /*-{
      this["max"] = max;
      return this;
    }-*/;

    public native final Options min(int min)
    /*-{
      this["min"] = min;
      return this;
    }-*/;

    public native final Options min(float min)
    /*-{
      this["min"] = min;
      return this;
    }-*/;

    public native final Options orientation(String orientation)
    /*-{
      this["orientation"] = orientation;
      return this;
    }-*/;

    public native final String orientation()
    /*-{
      return this["orientation"];
    }-*/;

    public native final Options range(boolean range)
    /*-{
      this["range"] = range;
      return this;
    }-*/;

    public native final boolean isRange()
    /*-{
      return this["range"];
    }-*/;

    public native final Options range(String range)
    /*-{
      this["range"] = range;
      return this;
    }-*/;

    public native final String range()
    /*-{
      return this["range"];
    }-*/;

    public native final Options step(int step)
    /*-{
      this["step"] = step;
      return this;
    }-*/;

    public native final Options step(float step)
    /*-{
      this["step"] = step;
      return this;
    }-*/;

    public native final Options value(int value)
    /*-{
      this["value"] = value;
      return this;
    }-*/;

    public native final Options value(float value)
    /*-{
      this["value"] = value;
      return this;
    }-*/;

    public native final Options values(JsArrayNumber values)
    /*-{
      this["values"] = values;
      return this;
    }-*/;

    public native final Options values(int lower, int upper)
    /*-{
      this["values"] = [lower, upper];
      return this;
    }-*/;

    public native final Options values(float lower, float upper)
    /*-{
      this["values"] = [lower, upper];
      return this;
    }-*/;

  }

  public static class Event extends JavaScriptObject {

    public static final String start = "slidestart";

    public static final String slide = "slide";

    public static final String change = "slidechange";

    public static final String stop = "slidestop";

    protected Event() {
    }

    public native final float floatValue()
    /*-{
      return this["value"];
    }-*/;

    public native final int intValue()
    /*-{
      return this["value"];
    }-*/;

    public native final JsArrayNumber values()
    /*-{
      return this["values"];
    }-*/;

    public native final JsArrayInteger intValues()
    /*-{
      return this["values"];
    }-*/;
  }

  private static class SliderPlugin implements UiPlugin<Slider> {

    public Slider init(Ui ui, WidgetOptions<?> options) {
      return new Slider(ui, (Options) options.cast());
    }
  }

  public static final Class<Slider> Slider = Slider.class;

  static {
    registerPlugin(Slider.class, new SliderPlugin());
  }

  public Slider(Ui ui, Slider.Options options) {
    super(ui, "slider", options);
  }

  public Slider value(int value) {
    invoke("value", value);
    return this;
  }

  public Slider value(float value) {
    invoke("value", value);
    return this;
  }

  public Slider values(int index, JsArrayNumber values) {
    invoke("values", index, values);
    return this;
  }

  public int intValue() {
    return invokeForInt("value");
  }

  public float floatValue() {
    return invokeForFloat("value");
  }

  public int intValues(int index) {
    return invokeForInt("values", index);
  }

  public float floatValues(int index) {
    return invokeForFloat("values", index);
  }
}
