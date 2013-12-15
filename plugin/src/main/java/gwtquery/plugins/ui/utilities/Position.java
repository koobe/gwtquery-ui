package gwtquery.plugins.ui.utilities;

import gwtquery.plugins.ui.Ui;
import gwtquery.plugins.ui.UiPlugin;
import gwtquery.plugins.ui.UiWidget;
import gwtquery.plugins.ui.WidgetOptions;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.query.client.GQuery;

/**
 * Implements jQuery-UI's Position
 * 
 * @see <a href="http://docs.jquery.com/UI/Position">jQuery-UI's Position</a>
 * 
 * @author Philippe Laflamme
 */
public class Position extends UiWidget<Position, Position.Options> {

  public static class Options extends WidgetOptions<Options> {

    protected Options() {

    }

    public static native final Options create()
    /*-{
      return {};
    }-*/;

    public native final Options my(String value)
    /*-{
      this["my"] = value;
      return this;
    }-*/;

    public native final String my()
    /*-{
      return this["my"];
    }-*/;

    public native final Options at(String value)
    /*-{
      this["at"] = value;
      return this;
    }-*/;

    public native final String at()
    /*-{
      return this["at"];
    }-*/;

    public native final Options of(String value)
    /*-{
      this["of"] = value;
      return this;
    }-*/;

    public native final Options of(Element value)
    /*-{
      this["of"] = value;
      return this;
    }-*/;

    public native final Options of(NodeList<?> value)
    /*-{
      this["of"] = value;
      return this;
    }-*/;

    public final Options of(GQuery of) {
      this.of(of.get());
      return this;
    };

    public native final JavaScriptObject of()
    /*-{
      return this["of"];
    }-*/;

    public native final Options offset(String offset)
    /*-{
      this["offset"] = offset;
      return this;
    }-*/;

    public native final String offset()
    /*-{
      return this["offset"];
    }-*/;

    public native final Options collision(String collision)
    /*-{
      this["collision"] = collision;
      return this;
    }-*/;

    public native final String collision()
    /*-{
      return this["collision"];
    }-*/;

    // TODO: implement using(function)
  }

  /**
   * Used to register the plugin.
   */
  private static class PositionPlugin implements UiPlugin<Position> {

    public Position init(Ui ui, WidgetOptions<?> options) {
      return new Position(ui, (Position.Options) options.cast());
    }

  }

  public static final Class<Position> Position = Position.class;

  static {
    registerPlugin(Position.class, new PositionPlugin());
  }

  public Position(Ui ui, Position.Options options) {
    super(ui, "position", options);
  }
}
