package gwtquery.samples.client.accordions;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;

import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.Function;
import com.google.gwt.user.client.Event;

public class Sortable extends AbstractAccordionDemo {

  public Sortable() {
    super("Sortable");
  }

  public String getName() {
    return "Sortable";
  }

  public void setupDemoElement(final Element demo) {
    // Mimics the closure's environment.
    final Stop stop = new Stop();

    // Note: the interaction between the sortable "stop" event and the accordion click event is currently not working.
    // Not sure why. Maybe due to missing stopImmediatePropagation() (see below).

    $("#accordion h3", demo).click(new Function() {
      @Override
      public boolean f(Event event) {
        if(stop.stop) {
          // TODO: there's no stopImmediatePropagation in GQuery. Is it necessary?
          event.stopPropagation();
          event.preventDefault();
          stop.stop = false;
        }
        return false;
      }
    });
    $("#accordion", demo).as(Ui).accordion("{header: \"> div > h3\"}").sortable("{axis: \"y\", handle: \"h3\"}").bind("sortstop", new Function() {
      @Override
      public boolean f(Event e, Object data) {
        stop.stop = true;
        return false;
      }
    });
  }

  private class Stop {
    boolean stop = false;
  }
}
