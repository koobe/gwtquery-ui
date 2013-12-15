package gwtquery.plugins.ui.interactions;

import gwtquery.plugins.ui.Ui;
import gwtquery.plugins.ui.UiPlugin;
import gwtquery.plugins.ui.UiWidget;
import gwtquery.plugins.ui.WidgetOptions;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.query.client.GQuery;

/**
 * Implements jQuery-UI's Selectable
 * 
 * @see <a href="http://docs.jquery.com/UI/Selectable">jQuery-UI's Selectable</a>
 * 
 * @author Philippe Laflamme
 */
public class Selectable extends UiWidget<Selectable, Selectable.Options> {

  public static class Options extends WidgetOptions<Options> {

    protected Options() {

    }

    public static native final Options create() /*-{
                                                return {};
                                                }-*/;

    public native final Options autoRefresh(boolean autoRefresh) /*-{
                                                                 this["autoRefresh"] = autoRefresh;
                                                                 return this;
                                                                 }-*/;

    public native final boolean autoRefresh() /*-{
                                              return this["autoRefresh"];
                                              }-*/;

    public native final Options cancel(String selector) /*-{
                                                        this["cancel"] = selector;
                                                        return this;
                                                        }-*/;

    public native final Options cancel(NodeList<?> selector) /*-{
                                                             this["cancel"] = selector;
                                                             return this;
                                                             }-*/;

    public final Options cancel(GQuery selector) {
      this.cancel(selector.get());
      return this;
    }

    public native final String cancel() /*-{
                                        return this["cancel"];
                                        }-*/;

    public native final Options delay(int delay) /*-{
                                                 this["delay"] = delay;
                                                 return this;
                                                 }-*/;

    public native final int delay() /*-{
                                    return this["delay"];
                                    }-*/;

    public native final Options distance(int distance) /*-{
                                                       this["distance"] = distance;
                                                       return this;
                                                       }-*/;

    public native final int distance() /*-{
                                       return this["distance"];
                                       }-*/;

    public native final Options filter(String filter) /*-{
                                                      this["filter"] = filter;
                                                      return this;
                                                      }-*/;

    public native final Options filter(NodeList<?> selector) /*-{
                                                             this["filter"] = selector;
                                                             return this;
                                                             }-*/;

    public final Options filter(GQuery selector) {
      this.filter(selector.get());
      return this;
    }

    public native final String filter() /*-{
                                        return this["filter"];
                                        }-*/;

    public native final Options tolerance(String tolerance) /*-{
                                                            this["tolerance"] = tolerance;
                                                            return this;
                                                            }-*/;

    public native final String tolerance() /*-{
                                           return this["tolerance"];
                                           }-*/;
  }

  public static class Event extends JavaScriptObject {

    public static final String selected = "selectableselected";

    public static final String selecting = "selectableselecting";

    public static final String start = "selectablestart";

    public static final String stop = "selectablestop";

    public static final String unselected = "selectableunselected";

    public static final String unselecting = "selectableunselecting";

    protected Event() {

    }

    public native final Element selected() /*-{
                                           return this["selected"];
                                           }-*/;

    public native final Element selecting() /*-{
                                            return this["selecting"];
                                            }-*/;

    public native final Element unselected() /*-{
                                             return this["unselected"];
                                             }-*/;

    public native final Element unselecting() /*-{
                                              return this["unselecting"];
                                              }-*/;
  }

  /**
   * Used to register the plugin.
   */
  private static class SelectablePlugin implements UiPlugin<Selectable> {

    public Selectable init(Ui ui, WidgetOptions<?> options) {
      return new Selectable(ui, (Selectable.Options) options.cast());
    }

  }

  public static final Class<Selectable> Selectable = Selectable.class;

  static {
    registerPlugin(Selectable.class, new SelectablePlugin());
  }

  public Selectable(Ui ui, Selectable.Options options) {
    super(ui, "selectable", options);
  }

  public Selectable refresh() {
    invoke("refresh");
    return this;
  }
}
