package gwtquery.samples.client.selectables;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.plugins.ui.interactions.Selectable;

import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.Function;
import com.google.gwt.query.client.GQuery;
import com.google.gwt.user.client.Event;

public class Serialize extends AbstractSelectableDemo {

  public Serialize() {
    super("Serialize");
  }

  public String getName() {
    return "Serialize";
  }

  public void setupDemoElement(Element demo) {
    $("#selectable").as(Ui).selectable().bind(Selectable.Event.stop, new Function() {
      @Override
      public boolean f(Event e, Object o) {
        final GQuery result = $("#select-result").empty();
        $(".ui-selected").each(new Function() {
          @Override
          public void f(Element e) {
            int index = $("#selectable li").index(e);
            result.append(" #" + (index + 1));
          }
        });
        return true;
      }
    });

  }
}
