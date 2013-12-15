package gwtquery.plugins.ui.interactions;

import gwtquery.plugins.ui.Ui;
import gwtquery.plugins.ui.UiPlugin;
import gwtquery.plugins.ui.UiWidget;
import gwtquery.plugins.ui.WidgetOptions;

/**
 * Implements jQuery-UI's Resizable
 * 
 * @see <a href="http://docs.jquery.com/UI/Resizable">jQuery-UI's Resizable</a>
 * 
 * @author Philippe Laflamme
 */
public class Resizable extends UiWidget<Resizable, Resizable.Options> {

  public static class Options extends WidgetOptions<Options> {

    protected Options() {

    }

    public static native final Options create()
    /*-{
      return {};
    }-*/;

    // TODO: implement options
  }

  // TODO: expose events

  /**
   * Used to register the plugin.
   */
  private static class ResizablePlugin implements UiPlugin<Resizable> {

    public Resizable init(Ui ui, WidgetOptions<?> options) {
      return new Resizable(ui, (Resizable.Options) options.cast());
    }

  }

  public static final Class<Resizable> Resizable = Resizable.class;

  static {
    registerPlugin(Resizable.class, new ResizablePlugin());
  }

  public Resizable(Ui ui, Resizable.Options options) {
    super(ui, "resizable", options);
  }
}
