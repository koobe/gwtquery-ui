package gwtquery.samples.client.positions;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.plugins.ui.utilities.Position;

import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.Function;
import com.google.gwt.user.client.Event;

public class Positions extends AbstractPositionDemo {

  public Positions() {
    super("Positions");
  }

  public String getName() {
    return "Default Functionality";
  }

  public void setupDemoElement(Element demo) {
    Function position = new Function() {
      @Override
      public void f(Element e) {
        $(".positionable").as(Ui).position(Position.Options.create() //
        .of($("#parent"))//
        .my($("#my_horizontal").val() + ' ' + $("#my_vertical").val())//
        .at($("#at_horizontal").val() + ' ' + $("#at_vertical").val())//
        .offset($("#offset").val()) //
        .collision($("#collision_horizontal").val() + ' ' + $("#collision_vertical").val()));
      }
    };

    $(".positionable").css("opacity", "0.5");

    // TODO: investigate why ":input" is throwing an exception.
    $("input").bind(Event.ONCLICK | Event.ONKEYUP | Event.ONCHANGE, null, position);
    $("select").bind(Event.ONCHANGE, null, position);

    $("#parent").as(Ui).draggable().bind("drag", position);

    $(".positionable").as(Ui).draggable().bind("drag", new Function() {
      @Override
      public boolean f(Event e, Object data) {
        // reset offset before calculating it
        $("#offset").val("0");
        // TODO: implement using GQuery
        // position(function(result) {
        // $("#offset").val("" + (ui.offset.left - result.left) + " " + (ui.offset.top - result.top));
        // position();
        // });

        return false;
      }
    });

    position.f(demo);

  }
}
