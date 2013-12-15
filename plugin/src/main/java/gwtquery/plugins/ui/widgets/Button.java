package gwtquery.plugins.ui.widgets;

import gwtquery.plugins.ui.Ui;
import gwtquery.plugins.ui.UiPlugin;
import gwtquery.plugins.ui.UiWidget;
import gwtquery.plugins.ui.WidgetOptions;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Implements jQuery-UI's Button
 * 
 * @see <a href="http://docs.jquery.com/UI/Button">jQuery-UI's Button</a>
 * 
 * @author Philippe Laflamme
 */
public class Button extends UiWidget<Button, Button.Options> {

  public static class Options extends WidgetOptions<Options> {

    protected Options() {

    }

    public static native final Options create()
    /*-{
      return {};
    }-*/;

    public native final Options label(String label)
    /*-{
      this["label"] = label;
      return this;
    }-*/;

    public native final String label()
    /*-{
      return this["label"];
    }-*/;

    public native final Options text(boolean text)
    /*-{
      this["text"] = text;
      return this;
    }-*/;

    public native final boolean text()
    /*-{
      return this["text"];
    }-*/;

    public native final Options icons(Icons icons)
    /*-{
      this["icons"] = icons;
      return this;
    }-*/;

    public native final Icons icons()
    /*-{
      return this["icons"];
    }-*/;
  }

  public static class Icons extends JavaScriptObject {

    protected Icons() {

    }

    public static native final Icons create()
    /*-{
      return {};
    }-*/;

    public native final Icons primary(String primary)
    /*-{
      this["primary"] = primary;
      return this;
    }-*/;

    public native final String primary()
    /*-{
      this["primary"];
    }-*/;

    public native final Icons secondary(String secondary)
    /*-{
      this["secondary"] = secondary;
      return this;
    }-*/;

    public native final String secondary()
    /*-{
      this["secondary"];
    }-*/;

  }

  /**
   * Used to register the plugin.
   */
  private static class ButtonPlugin implements UiPlugin<Button> {

    public Button init(Ui ui, WidgetOptions<?> options) {
      return new Button(ui, (Options) options.cast());
    }
  }

  public static final Class<Button> Button = Button.class;

  static {
    registerPlugin(Button.class, new ButtonPlugin());
  }

  public Button(Ui ui, Button.Options options) {
    super(ui, "button", options);
  }

  public Button refresh() {
    invoke("refresh");
    return this;
  }

}
