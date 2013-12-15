package gwtquery.plugins.ui.widgets;

import gwtquery.plugins.ui.Ui;
import gwtquery.plugins.ui.UiPlugin;
import gwtquery.plugins.ui.UiWidget;
import gwtquery.plugins.ui.WidgetOptions;

/**
 * Implements jQuery-UI's Progressbar
 * 
 * @see <a href="http://docs.jquery.com/UI/Progressbar">jQuery-UI's Progressbar</a>
 * 
 * @author Philippe Laflamme
 */
public class Progressbar extends UiWidget<Progressbar, Progressbar.Options> {

  public static class Options extends WidgetOptions<Options> {

    protected Options() {

    }

    public static native final Options create()
    /*-{
      return {};
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
  }

  /**
   * Used to register the plugin.
   */
  private static class ProgressbarPlugin implements UiPlugin<Progressbar> {

    public Progressbar init(Ui ui, WidgetOptions<?> options) {
      return new Progressbar(ui, (Progressbar.Options) options.cast());
    }

  }

  public static final Class<Progressbar> Progressbar = Progressbar.class;

  static {
    registerPlugin(Progressbar.class, new ProgressbarPlugin());
  }

  public Progressbar(Ui ui, Progressbar.Options options) {
    super(ui, "progressbar", options);
  }

  public Progressbar value(int value) {
    invoke("value", value);
    return this;
  }

  public Progressbar value(float value) {
    invoke("value", value);
    return this;
  }

  public int intValue() {
    return invokeForInt("value");
  }

  public float floatValue() {
    return invokeForFloat("value");
  }
}
