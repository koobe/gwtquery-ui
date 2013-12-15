package gwtquery.plugins.ui.widgets;

import gwtquery.plugins.ui.Ui;
import gwtquery.plugins.ui.UiPlugin;
import gwtquery.plugins.ui.UiWidget;
import gwtquery.plugins.ui.WidgetOptions;

/**
 * Implements jQuery-UI's Menu
 * 
 * @see <a href="http://docs.jquery.com/UI/Menu">jQuery-UI's Menu</a>
 * 
 * @author Philippe Laflamme
 */
public class Menu extends UiWidget<Menu, Menu.Options> {

  public static class Options extends WidgetOptions<Options> {

    protected Options() {

    }

    public static native final Options create() /*-{
                                                return {};
                                                }-*/;
  }

  /**
   * Used to register the plugin.
   */
  private static class MenuPlugin implements UiPlugin<Menu> {

    public Menu init(Ui ui, WidgetOptions<?> options) {
      return new Menu(ui, (Menu.Options) options.cast());
    }

  }

  public static final Class<Menu> Menu = Menu.class;

  static {
    registerPlugin(Menu.class, new MenuPlugin());
  }

  public Menu(Ui ui, Menu.Options options) {
    super(ui, "menu", options);
  }

  public Menu refresh() {
    invoke("refresh");
    return this;
  }

}
