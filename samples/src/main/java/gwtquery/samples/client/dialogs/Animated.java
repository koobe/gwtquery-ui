package gwtquery.samples.client.dialogs;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;

import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.Function;
import com.google.gwt.user.client.Event;

public class Animated extends AbstractDialogDemo {

  public Animated() {
    super("Animated");
  }

  public String getName() {
    return "Animated Dialogs";
  }

  public void setupDemoElement(Element demo) {
    $("#dialog").as(Ui).dialog("{autoOpen: false, show: 'blind', hide: 'explode'}");

    $("#opener").click(new Function() {
      @Override
      public boolean f(Event e) {
        $("#dialog").as(Ui).dialog().open();
        return false;
      }
    });

  }
}
