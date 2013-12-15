package gwtquery.plugins.ui.widgets;

import gwtquery.plugins.ui.Ui;
import gwtquery.plugins.ui.UiPlugin;
import gwtquery.plugins.ui.UiWidget;
import gwtquery.plugins.ui.WidgetOptions;

/**
 * Implements jQuery-UI's Buttonset
 * 
 * @see <a href="http://docs.jquery.com/UI/Button">jQuery-UI's Buttonset</a>
 * 
 * @author Philippe Laflamme
 */
public class Buttonset extends UiWidget<Buttonset, Button.Options> {

  /**
   * Used to register the plugin.
   */
  private static class ButtonPlugin implements UiPlugin<Buttonset> {

    public Buttonset init(Ui ui, WidgetOptions<?> options) {
      return new Buttonset(ui, (Button.Options) options.cast());
    }
  }

  public static final Class<Buttonset> Buttonset = Buttonset.class;

  static {
    registerPlugin(Buttonset.class, new ButtonPlugin());
  }

  public Buttonset(Ui ui, Button.Options options) {
    super(ui, "buttonset", options);
  }

  public Buttonset refresh() {
    invoke("refresh");
    return this;
  }

}
