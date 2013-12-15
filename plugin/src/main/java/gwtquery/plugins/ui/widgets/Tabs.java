package gwtquery.plugins.ui.widgets;

import gwtquery.plugins.ui.Ui;
import gwtquery.plugins.ui.UiPlugin;
import gwtquery.plugins.ui.UiWidget;
import gwtquery.plugins.ui.WidgetOptions;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.dom.client.Element;

/**
 * Implements jQuery-UI's Tabs
 * 
 * @see <a href="http://docs.jquery.com/UI/Tabs">jQuery-UI's Tabs</a>
 * 
 * @author Philippe Laflamme
 */
public class Tabs extends UiWidget<Tabs, Tabs.Options> {

  public static class Options extends WidgetOptions<Options> {

    protected Options() {

    }

    public static native final Options create()
    /*-{
      return {};
    }-*/;

    public native final Options ajaxOptions(String ajaxOptions)
    /*-{
      this["ajaxOptions"] = ajaxOptions;
      return this;
    }-*/;

    public native final String ajaxOptions()
    /*-{
      return this["ajaxOptions"];
    }-*/;

    public native final Options cache(boolean cache)
    /*-{
      this["cache"] = cache;
      return this;
    }-*/;

    public native final boolean cache()
    /*-{
      return this["cache"];
    }-*/;

    public native final Options collapsible(boolean collapsible)
    /*-{
      this["collapsible"] = collapsible;
      return this;
    }-*/;

    public native final boolean collapsible()
    /*-{
      return this["collapsible"];
    }-*/;

    public native final Options cookie(JavaScriptObject cookie)
    /*-{
      this["cookie"] = cookie;
      return this;
    }-*/;

    public native final JavaScriptObject cookie()
    /*-{
      return this["cookie"];
    }-*/;

    public native final Options deselectable(boolean deselectable)
    /*-{
      this["deselectable"] = deselectable;
      return this;
    }-*/;

    public native final boolean deselectable()
    /*-{
      return this["deselectable"];
    }-*/;

    public native final Options disabled(JsArrayInteger disabled)
    /*-{
      this["disabled"] = disabled;
      return this;
    }-*/;

    public native final JsArrayInteger disabledArray()
    /*-{
      return this["disabled"];
    }-*/;

    public native final Options event(String event)
    /*-{
      this["event"] = event;
      return this;
    }-*/;

    public native final String event()
    /*-{
      return this["event"];
    }-*/;

    public native final Options fx(JavaScriptObject fx)
    /*-{
      this["fx"] = fx;
      return this;
    }-*/;

    public native final JavaScriptObject fx()
    /*-{
      return this["fx"];
    }-*/;

    public native final Options idPrefix(String idPrefix)
    /*-{
      this["idPrefix"] = idPrefix;
      return this;
    }-*/;

    public native final String idPrefix()
    /*-{
      return this["idPrefix"];
    }-*/;

    public native final Options panelTemplate(String panelTemplate)
    /*-{
      this["panelTemplate"] = panelTemplate;
      return this;
    }-*/;

    public native final String panelTemplate()
    /*-{
      return this["panelTemplate"];
    }-*/;

    public native final Options selected(int selected)
    /*-{
      this["selected"] = selected;
      return this;
    }-*/;

    public native final int selected()
    /*-{
      return this["selected"];
    }-*/;

    public native final Options spinner(String spinner)
    /*-{
      this["spinner"] = spinner;
      return this;
    }-*/;

    public native final String spinner()
    /*-{
      return this["spinner"];
    }-*/;

    public native final Options tabTemplate(String tabTemplate)
    /*-{
      this["tabTemplate"] = tabTemplate;
      return this;
    }-*/;

    public native final String tabTemplate()
    /*-{
      return this["tabTemplate"];
    }-*/;
  }

  public static class Event extends JavaScriptObject {

    public static final String select = "tabsselect";

    public static final String load = "tabsload";

    public static final String show = "tabsshow";

    public static final String add = "tabsadd";

    public static final String remove = "tabsremove";

    public static final String enable = "tabsenable";

    public static final String disable = "tabsdisable";

    protected Event() {
    }

    public native final Element panel()
    /*-{
      return this["panel"];
    }-*/;

    public native final Element tab()
    /*-{
      return this["tab"];
    }-*/;

  }

  private static class TabsPlugin implements UiPlugin<Tabs> {

    public Tabs init(Ui ui, WidgetOptions<?> options) {
      return new Tabs(ui, (Options) options.cast());
    }
  }

  public static final Class<Tabs> Tabs = Tabs.class;

  static {
    registerPlugin(Tabs.class, new TabsPlugin());
  }

  public Tabs(Ui ui, Tabs.Options options) {
    super(ui, "tabs", options);
  }

  public Tabs add(String url, String label) {
    invoke("add", url, label);
    return this;
  }

  public Tabs add(String url, String label, int index) {
    invoke(ui, widgetType, "add", url, label, index);
    return this;
  }

  public Tabs remove(int index) {
    invoke("remove", index);
    return this;
  }

  public Tabs enable(int index) {
    invoke("enable", index);
    return this;
  }

  public Tabs disable(int index) {
    invoke("disable", index);
    return this;
  }

  public Tabs select(int index) {
    invoke("select", index);
    return this;
  }

  public Tabs load(int index) {
    invoke("load", index);
    return this;
  }

  public Tabs url(int index, String url) {
    invoke(ui, widgetType, "url", index, url);
    return this;
  }

  public int length() {
    return invokeForInt(ui, widgetType, "length");
  }

  public Tabs abort() {
    invoke("abort");
    return this;
  }

  public Tabs rotate(int ms, Boolean continuing) {
    invoke(ui, widgetType, "rotate", ms, continuing);
    return this;
  }

  private native final JavaScriptObject invoke(JavaScriptObject ui, String type, String method, int arg1, Object arg2)
  /*-{
    return ui[type](method, arg1, arg2);
  }-*/;

  private native final JavaScriptObject invoke(JavaScriptObject ui, String type, String method, String url, String label, int index)
  /*-{
    return ui[type](method, index, url, label, index);
  }-*/;
}
