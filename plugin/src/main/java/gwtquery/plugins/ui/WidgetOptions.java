package gwtquery.plugins.ui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Base class for widget option structures. This also defines all common widget properties.
 * 
 * @param <T> the option type for method chaining
 * 
 * @author Philippe Laflamme
 */
public abstract class WidgetOptions<T extends WidgetOptions<?>> extends JavaScriptObject {

  protected WidgetOptions() {

  }

  public native final String stringify()
  /*-{
    return JSON.stringify(this);
  }-*/;

  public native final T disabled(boolean disabled)
  /*-{
    this["disabled"] = disabled;
    return this;
  }-*/;

  public native final boolean disabled()
  /*-{
    return this["disabled"];
  }-*/;

}
