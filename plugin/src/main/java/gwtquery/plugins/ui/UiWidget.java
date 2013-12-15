package gwtquery.plugins.ui;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.query.client.Function;

/**
 * An abstract base class for all JQuery UI widgets.
 * 
 * @param <T> the widget type. Used for returning the proper type for method chaining
 * @param <O> the widget's options class
 * 
 * @author Philippe Laflamme
 */
public abstract class UiWidget<T extends UiWidget<?, ?>, O extends WidgetOptions<?>> extends Ui {

  protected final String widgetType;

  protected final JavaScriptObject ui;

  /**
   * Constructor for building a jQuery-UI widget.
   * 
   * @param nodeList the current selection
   * @param widgetType the type of widget to build (button, accordion, etc.)
   * @param options the widget options (may be null).
   */
  protected UiWidget(Ui nodeList, String widgetType, O options) {
    super(nodeList);
    this.widgetType = widgetType;
    this.ui = initUiWidget(widgetType, nodeList.get(), options);
  }

  public T destroy() {
    invoke("destroy");
    return getWidgetInstance();
  }

  public T disable() {
    invoke("disable");
    return getWidgetInstance();
  }

  public T enable() {
    invoke("enable");
    return getWidgetInstance();
  }

  public T option(String options) {
    invoke("option", options);
    return getWidgetInstance();
  }

  public T option(O options) {
    invoke("option", options);
    return getWidgetInstance();
  }

  public T option(String options, Object value) {
    invoke("option", options, value);
    return getWidgetInstance();
  }

  public O option() {
    return invoke(ui, widgetType, "option").cast();
  }

  /**
   * Binds a custom event to a callback function. This is used by jQuery-ui's event binding system.
   * 
   * @param name the widget's custom event name
   * @param f the callback function. The instance should override {@code Function#f(com.google.gwt.user.client.Event,
   * Object)}
   * @return this
   */
  public native final T bind(String name, Function f)
  /*-{
    this.@gwtquery.plugins.ui.UiWidget::ui = this.@gwtquery.plugins.ui.UiWidget::ui.bind(name, function(event, ui) {
      f.@com.google.gwt.query.client.Function::f(Lcom/google/gwt/user/client/Event;Ljava/lang/Object;)(event, ui);
    });
    return this;
  }-*/;

  protected JavaScriptObject invoke(String method) {
    return invoke(ui, widgetType, method);
  }

  protected int invokeForInt(String method) {
    return invokeForInt(ui, widgetType, method);
  }

  protected int invokeForInt(String method, int index) {
    return invokeForInt(ui, widgetType, method, index);
  }

  protected boolean invokeForBoolean(String method) {
    return invokeForBoolean(ui, widgetType, method);
  }

  protected float invokeForFloat(String method) {
    return invokeForFloat(ui, widgetType, method);
  }

  protected float invokeForFloat(String method, int index) {
    return invokeForFloat(ui, widgetType, method, index);
  }

  protected JavaScriptObject invoke(String method, Object arg) {
    return invoke(ui, widgetType, method, arg);
  }

  protected JavaScriptObject invoke(String method, int arg) {
    return invoke(ui, widgetType, method, arg);
  }

  protected JavaScriptObject invoke(String method, int arg, Object arg2) {
    return invoke(ui, widgetType, method, arg, arg2);
  }

  protected JavaScriptObject invoke(String method, boolean arg) {
    return invoke(ui, widgetType, method, arg);
  }

  protected JavaScriptObject invoke(String method, String option, Object value) {
    return invoke(ui, widgetType, method, option, value);
  }

  protected native final T getWidgetInstance()
  /*-{
    return this;
  }-*/;

  protected native final int invokeForInt(JavaScriptObject ui, String type, String method)
  /*-{
    return ui[type](method);
  }-*/;

  protected native final int invokeForInt(JavaScriptObject ui, String type, String method, int arg)
  /*-{
    return ui[type](method, arg);
  }-*/;

  protected native final boolean invokeForBoolean(JavaScriptObject ui, String type, String method)
  /*-{
    return ui[type](method);
  }-*/;

  protected native final float invokeForFloat(JavaScriptObject ui, String type, String method)
  /*-{
    return ui[type](method);
  }-*/;

  protected native final float invokeForFloat(JavaScriptObject ui, String type, String method, int arg)
  /*-{
    return ui[type](method, arg);
  }-*/;

  private native final JavaScriptObject invoke(JavaScriptObject ui, String type, String method)
  /*-{
    return ui[type](method);
  }-*/;

  private native final JavaScriptObject invoke(JavaScriptObject ui, String type, String method, Object arg)
  /*-{
    return ui[type](method, arg);
  }-*/;

  private native final JavaScriptObject invoke(JavaScriptObject ui, String type, String method, Object arg1, Object arg2)
  /*-{
    return ui[type](method, arg1, arg2);
  }-*/;

  private native final JavaScriptObject invoke(JavaScriptObject ui, String type, String method, int arg)
  /*-{
    return ui[type](method, arg);
  }-*/;

  private native final JavaScriptObject invoke(JavaScriptObject ui, String type, String method, boolean arg)
  /*-{
    return ui[type](method, arg);
  }-*/;

  private native final JavaScriptObject initUiWidget(String type, NodeList<Element> list, O options)
  /*-{
    return $wnd.jQuery(list)[type](options);
  }-*/;

}
