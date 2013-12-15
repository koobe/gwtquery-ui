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
 * Implements jQuery-UI's Droppable
 * 
 * @see <a href="http://docs.jquery.com/UI/Droppable">jQuery-UI's Droppable</a>
 * 
 * @author Philippe Laflamme
 */
public class Droppable extends UiWidget<Droppable, Droppable.Options> {

  public static class Options extends WidgetOptions<Options> {

    protected Options() {

    }

    public static native final Options create()
    /*-{
      return {};
    }-*/;

    public native final Options accept(String accept)
    /*-{
      this["accept"] = accept;
      return this;
    }-*/;

    public native final Options accept(Element accept)
    /*-{
      this["accept"] = accept;
      return this;
    }-*/;

    public native final Options accept(NodeList<?> accept)
    /*-{
      this["accept"] = accept;
      return this;
    }-*/;

    public final Options accept(GQuery accept) {
      return accept(accept.get());
    }

    public native final JavaScriptObject accept()
    /*-{
      return this["accept"];
    }-*/;

    public native final Options activeClass(String activeClass)
    /*-{
      this["activeClass"] = activeClass;
      return this;
    }-*/;

    public native final String activeClass()
    /*-{
      return this["activeClass"];
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

    public native final Options greedy(Boolean greedy)
    /*-{
      this["greedy"] = greedy;
      return this;
    }-*/;

    public native final Boolean greedy()
    /*-{
      return this["greedy"];
    }-*/;

    public native final Options hoverClass(String hoverClass)
    /*-{
      this["hoverClass"] = hoverClass;
      return this;
    }-*/;

    public native final String hoverClass()
    /*-{
      return this["hoverClass"];
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

    public native final Options tolerance(String tolerance)
    /*-{
      this["tolerance"] = tolerance;
      return this;
    }-*/;

    public native final String tolerance()
    /*-{
      return this["tolerance"];
    }-*/;
  }

  public static class Event extends JavaScriptObject {

    public static final String activate = "dropactivate";

    public static final String deactivate = "dropdeactivate";

    public static final String over = "dropover";

    public static final String out = "dropout";

    public static final String drop = "drop";

    protected Event() {
    }

    // TODO: ideally we should return a Draggable instance here.
    // This requires that we construct a new Draggable instance by passing the jQuery object to the ctor.
    public native final Element draggable()
    /*-{
      return this["draggable"].get(0);
    }-*/;

  }

  /**
   * Used to register the plugin.
   */
  private static class DroppablePlugin implements UiPlugin<Droppable> {

    public Droppable init(Ui ui, WidgetOptions<?> options) {
      return new Droppable(ui, (Droppable.Options) options.cast());
    }

  }

  public static final Class<Droppable> Droppable = Droppable.class;

  static {
    registerPlugin(Droppable.class, new DroppablePlugin());
  }

  public Droppable(Ui ui, Droppable.Options options) {
    super(ui, "droppable", options);
  }
}
