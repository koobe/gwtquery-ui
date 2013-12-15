package gwtquery.samples.client.draggables;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.plugins.ui.interactions.Draggable;

import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.Function;
import com.google.gwt.query.client.GQuery;

public class Event extends AbstractDraggableDemo {

  public Event() {
    super("Event");
  }

  public String getName() {
    return "Events";
  }

  public void setupDemoElement(Element demo) {
    final GQuery start_counter = $("#event-start");
    final GQuery drag_counter = $("#event-drag");
    final GQuery stop_counter = $("#event-stop");
    final int[] counts = new int[] { 0, 0, 0 };

    $("#draggable").as(Ui).draggable().bind(Draggable.Event.start, new Function() {
      @Override
      public boolean f(com.google.gwt.user.client.Event e, Object data) {
        counts[0]++;
        updateCounterStatus(start_counter, counts[0]);
        return false;
      }
    }).bind(Draggable.Event.drag, new Function() {
      @Override
      public boolean f(com.google.gwt.user.client.Event e, Object data) {
        counts[1]++;
        updateCounterStatus(drag_counter, counts[1]);
        return false;
      }
    }).bind(Draggable.Event.stop, new Function() {
      @Override
      public boolean f(com.google.gwt.user.client.Event e, Object data) {
        counts[2]++;
        updateCounterStatus(stop_counter, counts[2]);
        return false;
      }
    });
  }

  private void updateCounterStatus(GQuery event_counter, int new_count) {
    // first update the status visually...
    if(!event_counter.hasClass("ui-state-hover")) {
      event_counter.addClass("ui-state-hover").siblings().removeClass("ui-state-hover");
    }
    // ...then update the numbers
    $("span.count", event_counter.get(0)).text("" + new_count);
  }
}
