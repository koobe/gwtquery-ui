package gwtquery.plugins.ui.interactions;

import gwtquery.plugins.ui.Ui;
import gwtquery.plugins.ui.UiPlugin;
import gwtquery.plugins.ui.UiWidget;
import gwtquery.plugins.ui.WidgetOptions;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.query.client.GQuery;

/**
 * Implements jQuery-UI's Draggable
 * 
 * @see <a href="http://docs.jquery.com/UI/Draggable">jQuery-UI's Draggable</a>
 * 
 * @author Philippe Laflamme
 */
public class Draggable extends UiWidget<Draggable, Draggable.Options> {

  public static class Options extends WidgetOptions<Options> {

    protected Options() {

    }

    public static native final Options create()
    /*-{
      return {};
    }-*/;

    public native final Options addClasses(Boolean addClasses)
    /*-{
      this["addClasses"] = addClasses;
      return this;
    }-*/;

    public native final Boolean addClasses()
    /*-{
      return this["addClasses"];
    }-*/;

    public native final Options appendTo(String selector)
    /*-{
      this["appendTo"] = selector;
      return this;
    }-*/;

    public native final Options appendTo(Element element)
    /*-{
      this["appendTo"] = element;
      return this;
    }-*/;

    public native final Options appendTo(NodeList<?> value)
    /*-{
      this["appendTo"] = value;
      return this;
    }-*/;

    public final Options of(GQuery of) {
      this.appendTo(of.get());
      return this;
    };

    public native final Options axis(String axis)
    /*-{
      this["axis"] = axis;
      return this;
    }-*/;

    public native final String axis()
    /*-{
      return this["axis"];
    }-*/;

    public native final Options cancel(String cancel)
    /*-{
      this["cancel"] = cancel;
      return this;
    }-*/;

    public native final String cancel()
    /*-{
      return this["cancel"];
    }-*/;

    public native final Options connectToSortable(String connectToSortable)
    /*-{
      this["connectToSortable"] = connectToSortable;
      return this;
    }-*/;

    public native final String connectToSortable()
    /*-{
      return this["connectToSortable"];
    }-*/;

    public native final Options containment(String containment)
    /*-{
      this["containment"] = containment;
      return this;
    }-*/;

    public native final Options containment(Element containment)
    /*-{
      this["containment"] = containment;
      return this;
    }-*/;

    public native final Options containment(JsArrayInteger containment)
    /*-{
      this["containment"] = containment;
      return this;
    }-*/;

    public final Options containment(GQuery gquery) {
      this.containment(gquery.get(0));
      return this;
    }

    public native final Options cursor(String cursor)
    /*-{
      this["cursor"] = cursor;
      return this;
    }-*/;

    public native final String cursor()
    /*-{
      return this["cursor"];
    }-*/;

    public native final Options cursorAt(JavaScriptObject cursorAt)
    /*-{
      this["cursorAt"] = cursorAt;
      return this;
    }-*/;

    public native final JavaScriptObject cursorAt()
    /*-{
      return this["cursorAt"];
    }-*/;

    public native final Options delay(Integer delay)
    /*-{
      this["delay"] = delay;
      return this;
    }-*/;

    public native final Integer delay()
    /*-{
      return this["delay"];
    }-*/;

    public native final Options distance(Integer distance)
    /*-{
      this["distance"] = distance;
      return this;
    }-*/;

    public native final Integer distance()
    /*-{
      return this["distance"];
    }-*/;

    public native final Options grid(JsArrayInteger grid)
    /*-{
      this["grid"] = grid;
      return this;
    }-*/;

    public native final Options grid(int x, int y)
    /*-{
      this["grid"] = [x,y];
      return this;
    }-*/;

    public native final JsArrayInteger grid()
    /*-{
      return this["grid"];
    }-*/;

    public native final Options handle(String handle)
    /*-{
      this["handle"] = handle;
      return this;
    }-*/;

    public native final Options handle(Element handle)
    /*-{
      this["handle"] = handle;
      return this;
    }-*/;

    public final Options handle(GQuery gquery) {
      this.handle(gquery.get(0));
      return this;
    }

    public native final Options helper(String helper)
    /*-{
      this["helper"] = helper;
      return this;
    }-*/;

    public native final String helper()
    /*-{
      return this["helper"];
    }-*/;

    public native final Options iframeFix(Boolean iframeFix)
    /*-{
      this["iframeFix"] = iframeFix;
      return this;
    }-*/;

    public native final Boolean iframeFix()
    /*-{
      return this["iframeFix"];
    }-*/;

    public native final Options opacity(Float opacity)
    /*-{
      this["opacity"] = opacity;
      return this;
    }-*/;

    public native final Float opacity()
    /*-{
      return this["opacity"];
    }-*/;

    public native final Options refreshPositions(Boolean refreshPositions)
    /*-{
      this["refreshPositions"] = refreshPositions;
      return this;
    }-*/;

    public native final Boolean refreshPositions()
    /*-{
      return this["refreshPositions"];
    }-*/;

    public native final Options revert(Boolean revert)
    /*-{
      this["revert"] = revert;
      return this;
    }-*/;

    public native final Options revert(String revert)
    /*-{
      this["revert"] = revert;
      return this;
    }-*/;

    public native final String revert()
    /*-{
      return this["revert"];
    }-*/;

    public native final Boolean isRevert()
    /*-{
      return this["revert"];
    }-*/;

    public native final Options revertDuration(Integer revertDuration)
    /*-{
      this["revertDuration"] = revertDuration;
      return this;
    }-*/;

    public native final Integer revertDuration()
    /*-{
      return this["revertDuration"];
    }-*/;

    public native final Options scope(String scope)
    /*-{
      this["scope"] = scope;
      return this;
    }-*/;

    public native final String scope()
    /*-{
      return this["scope"];
    }-*/;

    public native final Options scroll(Boolean scroll)
    /*-{
      this["scroll"] = scroll;
      return this;
    }-*/;

    public native final Boolean scroll()
    /*-{
      return this["scroll"];
    }-*/;

    public native final Options scrollSensitivity(Integer scrollSensitivity)
    /*-{
      this["scrollSensitivity"] = scrollSensitivity;
      return this;
    }-*/;

    public native final Integer scrollSensitivity()
    /*-{
      return this["scrollSensitivity"];
    }-*/;

    public native final Options scrollSpeed(Integer scrollSpeed)
    /*-{
      this["scrollSpeed"] = scrollSpeed;
      return this;
    }-*/;

    public native final Integer scrollSpeed()
    /*-{
      return this["scrollSpeed"];
    }-*/;

    public native final Options snap(Boolean snap)
    /*-{
      this["snap"] = snap;
      return this;
    }-*/;

    public native final Options snap(String snap)
    /*-{
      this["snap"] = snap;
      return this;
    }-*/;

    public native final Options snapMode(String snapMode)
    /*-{
      this["snapMode"] = snapMode;
      return this;
    }-*/;

    public native final String snapMode()
    /*-{
      return this["snapMode"];
    }-*/;

    public native final Options snapTolerance(Integer snapTolerance)
    /*-{
      this["snapTolerance"] = snapTolerance;
      return this;
    }-*/;

    public native final Integer snapTolerance()
    /*-{
      return this["snapTolerance"];
    }-*/;

    public native final Options stack(String stack)
    /*-{
      this["stack"] = stack;
      return this;
    }-*/;

    public native final Options stack(Element stack)
    /*-{
      this["stack"] = stack;
      return this;
    }-*/;

    public final Options stack(GQuery gquery) {
      this.stack(gquery.get(0));
      return this;
    }

    public native final Options zIndex(Integer zIndex)
    /*-{
      this["zIndex"] = zIndex;
      return this;
    }-*/;

    public native final Integer zIndex()
    /*-{
      return this["zIndex"];
    }-*/;

  }

  public static class Event extends JavaScriptObject {

    public static final String drag = "drag";

    public static final String start = "dragstart";

    public static final String stop = "dragstop";

    protected Event() {

    }
  }

  /**
   * Used to register the plugin.
   */
  private static class DraggablePlugin implements UiPlugin<Draggable> {

    public Draggable init(Ui ui, WidgetOptions<?> options) {
      return new Draggable(ui, (Draggable.Options) options.cast());
    }

  }

  public static final Class<Draggable> Draggable = Draggable.class;

  static {
    registerPlugin(Draggable.class, new DraggablePlugin());
  }

  public Draggable(Ui ui, Draggable.Options options) {
    super(ui, "draggable", options);
  }
}
