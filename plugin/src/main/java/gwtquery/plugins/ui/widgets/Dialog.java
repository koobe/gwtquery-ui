package gwtquery.plugins.ui.widgets;

import gwtquery.plugins.ui.Ui;
import gwtquery.plugins.ui.UiPlugin;
import gwtquery.plugins.ui.UiWidget;
import gwtquery.plugins.ui.WidgetOptions;
import gwtquery.plugins.ui.utilities.Position;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.query.client.Function;

/**
 * Implements jQuery-UI's Dialog
 * 
 * @see <a href="http://docs.jquery.com/UI/Dialog">jQuery-UI's Dialog</a>
 * 
 * @author Philippe Laflamme
 */
public class Dialog extends UiWidget<Dialog, Dialog.Options> {

  public static class Options extends WidgetOptions<Options> {

    protected Options() {

    }

    public static native final Options create()
    /*-{
      return {};
    }-*/;

    public native final Options autoOpen(boolean autoOpen)
    /*-{
      this["autoOpen"] = autoOpen;
      return this;
    }-*/;

    public native final boolean autoOpen()
    /*-{
      return this["autoOpen"];
    }-*/;

    public native final Options buttons(Buttons buttons)
    /*-{
      this["buttons"] = buttons;
      return this;
    }-*/;

    public native final Buttons buttons()
    /*-{
      return this["buttons"];
    }-*/;

    public native final Options closeOnEscape(boolean closeOnEscape)
    /*-{
      this["closeOnEscape"] = closeOnEscape;
      return this;
    }-*/;

    public native final boolean closeOnEscape()
    /*-{
      return this["closeOnEscape"];
    }-*/;

    public native final Options closeText(String closeText)
    /*-{
      this["closeText"] = closeText;
      return this;
    }-*/;

    public native final boolean closeText()
    /*-{
      return this["closeText"];
    }-*/;

    public native final Options dialogClass(String dialogClass)
    /*-{
      this["dialogClass"] = dialogClass;
      return this;
    }-*/;

    public native final boolean dialogClass()
    /*-{
      return this["dialogClass"];
    }-*/;

    public native final Options draggable(boolean draggable)
    /*-{
      this["draggable"] = draggable;
      return this;
    }-*/;

    public native final boolean draggable()
    /*-{
      return this["draggable"];
    }-*/;

    public native final Options height(int height)
    /*-{
      this["height"] = height;
      return this;
    }-*/;

    public native final int height()
    /*-{
      return this["height"];
    }-*/;

    public native final Options hide(String hide)
    /*-{
      this["hide"] = hide;
      return this;
    }-*/;

    public native final String hide()
    /*-{
      return this["hide"];
    }-*/;

    public native final Options maxHeight(int maxHeight)
    /*-{
      this["maxHeight"] = maxHeight;
      return this;
    }-*/;

    public native final int maxHeight()
    /*-{
      return this["maxHeight"];
    }-*/;

    public native final Options maxWidth(int maxWidth)
    /*-{
      this["maxWidth"] = maxWidth;
      return this;
    }-*/;

    public native final int maxWidth()
    /*-{
      return this["maxWidth"];
    }-*/;

    public native final Options minHeight(int minHeight)
    /*-{
      this["minHeight"] = minHeight;
      return this;
    }-*/;

    public native final int minHeight()
    /*-{
      return this["minHeight"];
    }-*/;

    public native final Options minWidth(int minWidth)
    /*-{
      this["minWidth"] = minWidth;
      return this;
    }-*/;

    public native final int minWidth()
    /*-{
      return this["minWidth"];
    }-*/;

    public native final Options modal(boolean modal)
    /*-{
      this["modal"] = modal;
      return this;
    }-*/;

    public native final boolean modal()
    /*-{
      return this["modal"];
    }-*/;

    public native final Options position(String position)
    /*-{
      this["position"] = position;
      return this;
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

    public native final Options resizable(boolean resizable)
    /*-{
      this["resizable"] = resizable;
      return this;
    }-*/;

    public native final boolean resizable()
    /*-{
      return this["resizable"];
    }-*/;

    public native final Options show(String show)
    /*-{
      this["show"] = show;
      return this;
    }-*/;

    public native final String show()
    /*-{
      return this["show"];
    }-*/;

    public native final Options stack(boolean stack)
    /*-{
      this["stack"] = stack;
      return this;
    }-*/;

    public native final boolean stack()
    /*-{
      return this["stack"];
    }-*/;

    public native final Options title(String title)
    /*-{
      this["title"] = title;
      return this;
    }-*/;

    public native final String title()
    /*-{
      return this["title"];
    }-*/;

    public native final Options width(int width)
    /*-{
      this["width"] = width;
      return this;
    }-*/;

    public native final int width()
    /*-{
      return this["width"];
    }-*/;

    public native final Options zIndex(int zIndex)
    /*-{
      this["zIndex"] = zIndex;
      return this;
    }-*/;

    public native final int zIndex()
    /*-{
      return this["zIndex"];
    }-*/;
  }

  public static class Buttons extends JavaScriptObject {

    protected Buttons() {

    }

    public static native final Buttons create()
    /*-{
      return {};
    }-*/;

    public native final Buttons define(String button, Function f)
    /*-{
      this[button] = function(event) {
        f.@com.google.gwt.query.client.Function::f(Lcom/google/gwt/user/client/Event;)(event);
      }
      return this;
    }-*/;
  }

  public static class Event extends JavaScriptObject {

    public static final String beforeclose = "dialogbeforeclose";

    public static final String open = "dialogopen";

    public static final String focus = "dialogfocus";

    public static final String dragStart = "dialogdragstart";

    public static final String drag = "dialogdrag";

    public static final String dragStop = "dialogdragstop";

    public static final String resizeStart = "dialogresizestart";

    public static final String resize = "dialogresize";

    public static final String resizeStop = "dialogresizestop";

    public static final String close = "dialogclose";

    protected Event() {
    }

  }

  /**
   * Used to register the plugin.
   */
  private static class DialogPlugin implements UiPlugin<Dialog> {

    public Dialog init(Ui ui, WidgetOptions<?> options) {
      return new Dialog(ui, (Options) options.cast());
    }
  }

  public static final Class<Dialog> Dialog = Dialog.class;

  static {
    registerPlugin(Dialog.class, new DialogPlugin());
  }

  public Dialog(Ui ui, Dialog.Options options) {
    super(ui, "dialog", options);
  }

  public Dialog close() {
    invoke("close");
    return this;
  }

  public Dialog moveToTop() {
    invoke("moveToTop");
    return this;
  }

  public Dialog open() {
    invoke("open");
    return this;
  }

  public boolean isOpen() {
    return invokeForBoolean("isOpen");
  }

}
