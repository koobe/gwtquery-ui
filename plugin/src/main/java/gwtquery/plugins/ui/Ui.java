package gwtquery.plugins.ui;

import static gwtquery.plugins.ui.interactions.Draggable.Draggable;
import static gwtquery.plugins.ui.interactions.Droppable.Droppable;
import static gwtquery.plugins.ui.interactions.Resizable.Resizable;
import static gwtquery.plugins.ui.interactions.Selectable.Selectable;
import static gwtquery.plugins.ui.interactions.Sortable.Sortable;
import static gwtquery.plugins.ui.utilities.Position.Position;
import static gwtquery.plugins.ui.widgets.Accordion.Accordion;
import static gwtquery.plugins.ui.widgets.Autocomplete.Autocomplete;
import static gwtquery.plugins.ui.widgets.Button.Button;
import static gwtquery.plugins.ui.widgets.Buttonset.Buttonset;
import static gwtquery.plugins.ui.widgets.Datepicker.Datepicker;
import static gwtquery.plugins.ui.widgets.Dialog.Dialog;
import static gwtquery.plugins.ui.widgets.Menu.Menu;
import static gwtquery.plugins.ui.widgets.Progressbar.Progressbar;
import static gwtquery.plugins.ui.widgets.Slider.Slider;
import static gwtquery.plugins.ui.widgets.Tabs.Tabs;
import gwtquery.plugins.ui.interactions.Draggable;
import gwtquery.plugins.ui.interactions.Droppable;
import gwtquery.plugins.ui.interactions.Resizable;
import gwtquery.plugins.ui.interactions.Selectable;
import gwtquery.plugins.ui.interactions.Sortable;
import gwtquery.plugins.ui.utilities.Position;
import gwtquery.plugins.ui.widgets.Accordion;
import gwtquery.plugins.ui.widgets.Autocomplete;
import gwtquery.plugins.ui.widgets.Button;
import gwtquery.plugins.ui.widgets.Buttonset;
import gwtquery.plugins.ui.widgets.Datepicker;
import gwtquery.plugins.ui.widgets.Dialog;
import gwtquery.plugins.ui.widgets.Menu;
import gwtquery.plugins.ui.widgets.Progressbar;
import gwtquery.plugins.ui.widgets.Slider;
import gwtquery.plugins.ui.widgets.Tabs;

import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.query.client.GQuery;
import com.google.gwt.query.client.js.JsMap;
import com.google.gwt.query.client.plugins.Plugin;

/**
 * Experimental Gwt Query plugin for integrating JQuery UI.
 * 
 * @author Philippe Laflamme
 */
public class Ui extends GQuery {

  public static final Class<Ui> Ui = Ui.class;

  /**
   * Used to register the plugin.
   */
  static {
    GQuery.registerPlugin(Ui.class, new Plugin<Ui>() {
      public Ui init(GQuery gq) {
        return new Ui(gq);
      }
    });
  }

  public Ui(GQuery gq) {
    super(gq);
  }

  public static void registerPlugin(Class<? extends Ui> plugin, UiPlugin<? extends Ui> pluginFactory) {
    if(plugins == null) {
      plugins = JsMap.createObject().cast();
    }
    plugins.put(plugin, pluginFactory);
  }

  private static JsMap<Class<? extends Ui>, UiPlugin<? extends Ui>> plugins;

  public final Accordion accordion() {
    return asWidget(Accordion);
  }

  public final Accordion accordion(Accordion.Options options) {
    return asWidget(Accordion, options);
  }

  public final Accordion accordion(String options) {
    return asWidget(Accordion, options);
  }

  public final Autocomplete autocomplete() {
    return asWidget(Autocomplete);
  }

  public final Autocomplete autocomplete(Autocomplete.Options options) {
    return asWidget(Autocomplete, options);
  }

  public final Autocomplete autocomplete(String options) {
    return asWidget(Autocomplete, options);
  }

  public final Button button() {
    return asWidget(Button);
  }

  public final Button button(Button.Options options) {
    return asWidget(Button, options);
  }

  public final Button button(String options) {
    return asWidget(Button, options);
  }

  public final Buttonset buttonset() {
    return asWidget(Buttonset);
  }

  public final Buttonset buttonset(Button.Options options) {
    return asWidget(Buttonset, options);
  }

  public final Buttonset buttonset(String options) {
    return asWidget(Buttonset, options);
  }

  public final Datepicker datepicker() {
    return asWidget(Datepicker);
  }

  public final Datepicker datepicker(Datepicker.Options options) {
    return asWidget(Datepicker, options);
  }

  public final Datepicker datepicker(String options) {
    return asWidget(Datepicker, options);
  }

  public final Dialog dialog() {
    return asWidget(Dialog);
  }

  public final Dialog dialog(Dialog.Options options) {
    return asWidget(Dialog, options);
  }

  public final Dialog dialog(String options) {
    return asWidget(Dialog, options);
  }

  public final Draggable draggable() {
    return asWidget(Draggable);
  }

  public final Draggable draggable(Draggable.Options options) {
    return asWidget(Draggable, options);
  }

  public final Draggable draggable(String options) {
    return asWidget(Draggable, options);
  }

  public final Droppable droppable() {
    return asWidget(Droppable);
  }

  public final Droppable droppable(Droppable.Options options) {
    return asWidget(Droppable, options);
  }

  public final Droppable droppable(String options) {
    return asWidget(Droppable, options);
  }

  public final Menu menu() {
    return asWidget(Menu);
  }

  public final Menu menu(Menu.Options options) {
    return asWidget(Menu, options);
  }

  public final Menu menu(String options) {
    return asWidget(Menu, options);
  }

  public final Progressbar progressbar() {
    return asWidget(Progressbar);
  }

  public final Progressbar progressbar(Progressbar.Options options) {
    return asWidget(Progressbar, options);
  }

  public final Progressbar progressbar(String options) {
    return asWidget(Progressbar, options);
  }

  public final Position position(Position.Options options) {
    return asWidget(Position, options);
  }

  public final Position position(String options) {
    return asWidget(Position, options);
  }

  public final Resizable resizable() {
    return asWidget(Resizable);
  }

  public final Resizable resizable(Resizable.Options options) {
    return asWidget(Resizable, options);
  }

  public final Resizable resizable(String options) {
    return asWidget(Resizable, options);
  }

  public final Selectable selectable() {
    return asWidget(Selectable);
  }

  public final Selectable selectable(Selectable.Options options) {
    return asWidget(Selectable, options);
  }

  public final Selectable selectable(String options) {
    return asWidget(Selectable, options);
  }

  public final Slider slider() {
    return asWidget(Slider);
  }

  public final Slider slider(Slider.Options options) {
    return asWidget(Slider, options);
  }

  public final Slider slider(String options) {
    return asWidget(Slider, options);
  }

  public final Sortable sortable() {
    return asWidget(Sortable);
  }

  public final Sortable sortable(Sortable.Options options) {
    return asWidget(Sortable, options);
  }

  public final Sortable sortable(String options) {
    return asWidget(Sortable, options);
  }

  public final Tabs tabs() {
    return asWidget(Tabs);
  }

  public final Tabs tabs(Tabs.Options options) {
    return asWidget(Tabs, options);
  }

  public final Tabs tabs(String options) {
    return asWidget(Tabs, options);
  }

  public <T extends Ui> T asWidget(Class<T> plugin) {
    return asWidget(plugin, (WidgetOptions<?>) null);
  }

  public <T extends Ui> T asWidget(Class<T> plugin, String options) {
    return asWidget(plugin, (WidgetOptions<?>) JsonUtils.unsafeEval(options));
  }

  /**
   * Convert to the widget's interface provided by Class literal and using the specified options (may be null).
   */
  @SuppressWarnings("unchecked")
  public <T extends Ui> T asWidget(Class<T> plugin, WidgetOptions<?> options) {
    // GQuery is not a plugin for itself
    if(plugin == Ui) {
      return (T) $(this);
    } else if(plugins != null) {
      return (T) plugins.get(plugin).init(this, options);
    }
    throw new RuntimeException("No plugin registered for class " + plugin);
  }

}
