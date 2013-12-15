package gwtquery.samples.client.accordions;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.plugins.ui.widgets.Accordion;

import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.Function;
import com.google.gwt.user.client.Event;

public class FillSpace extends AbstractAccordionDemo {

  public FillSpace() {
    super("FillSpace");
  }

  public String getName() {
    return "Fill Space";
  }

  public void setupDemoElement(final Element demo) {
    $("#accordion", demo).as(Ui).accordion(Accordion.Options.create().fillSpace(true));

    $("#accordionResizer", demo).as(Ui).resizable().bind("resize", new Function() {
      @Override
      public boolean f(Event e) {
        $("#accordion", demo).as(Ui).accordion().resize();
        return true;
      }
    });
  }
}
