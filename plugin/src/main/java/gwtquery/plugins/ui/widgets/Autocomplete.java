package gwtquery.plugins.ui.widgets;

import gwtquery.plugins.ui.Ui;
import gwtquery.plugins.ui.UiPlugin;
import gwtquery.plugins.ui.UiWidget;
import gwtquery.plugins.ui.WidgetOptions;
import gwtquery.plugins.ui.utilities.Position;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

/**
 * Implements jQuery-UI's Autocomplete
 * 
 * @see <a href="http://docs.jquery.com/UI/Autocomplete">jQuery-UI's Autocomplete</a>
 * 
 * @author Philippe Laflamme
 */
public class Autocomplete extends UiWidget<Autocomplete, Autocomplete.Options> {

  public static class Options extends WidgetOptions<Options> {

    protected Options() {

    }

    public static native final Options create()
    /*-{
      return {};
    }-*/;

    public native final Options delay(int delay)
    /*-{
      this["delay"] = delay;
      return this;
    }-*/;

    public native final int delay()
    /*-{
      return this["delay"];
    }-*/;

    public native final Options minLength(int minLength)
    /*-{
      this["minLength"] = minLength;
      return this;
    }-*/;

    public native final int minLength()
    /*-{
      return this["minLength"];
    }-*/;

    public native final Options position(Position.Options position)
    /*-{
      this["position"] = position;
      return this;
    }-*/;

    public native final Position.Options position()
    /*-{
      return this["position"];
    }-*/;

    public native final Options source(JsArrayString source)
    /*-{
      this["source"] = source;
      return this;
    }-*/;

    public final Options source(String... source) {
      JsArrayString a = JavaScriptObject.createArray().cast();
      for(String s : source)
        a.push(s);
      source(a);
      return this;
    };

    public native final Options source(JsArray<Source> source)
    /*-{
      this["source"] = source;
      return this;
    }-*/;

    public final Options source(Source... source) {
      JsArray<Source> a = JavaScriptObject.createArray().cast();
      for(Source s : source)
        a.push(s);
      source(a);
      return this;
    };

    public native final Options source(String url)
    /*-{
      this["source"] = url;
      return this;
    }-*/;

    // TODO: another flavor of source is a callback function
  }

  public static class Source extends JavaScriptObject {

    protected Source() {

    }

    public static native final Source create()
    /*-{
      return {};
    }-*/;

    public native final Source label(String label)
    /*-{
      this["label"] = label;
      return this;
    }-*/;

    public native final String label()
    /*-{
      return this["label"];
    }-*/;

    public native final Source value(String value)
    /*-{
      this["value"] = value;
      return this;
    }-*/;

    public native final String value()
    /*-{
      return this["value"];
    }-*/;

  }

  public static class Event extends JavaScriptObject {

    public static final String search = "autocompletesearch";

    public static final String open = "autocompleteopen";

    public static final String focus = "autocompletefocus";

    public static final String select = "autocompleteselect";

    public static final String close = "autocompleteclose";

    public static final String change = "autocompletechange";

    protected Event() {
    }

    public native final Source item()
    /*-{
      return this["item"];
    }-*/;
  }

  private static class AutocompletePlugin implements UiPlugin<Autocomplete> {

    public Autocomplete init(Ui ui, WidgetOptions<?> options) {
      return new Autocomplete(ui, (Options) options.cast());
    }
  }

  public static final Class<Autocomplete> Autocomplete = Autocomplete.class;

  static {
    registerPlugin(Autocomplete.class, new AutocompletePlugin());
  }

  public Autocomplete(Ui ui, Autocomplete.Options options) {
    super(ui, "autocomplete", options);
  }

  public Autocomplete search() {
    invoke("search");
    return this;
  }

  public Autocomplete search(String value) {
    invoke("search", value);
    return this;
  }

  public Autocomplete close() {
    invoke("close");
    return this;
  }

}
