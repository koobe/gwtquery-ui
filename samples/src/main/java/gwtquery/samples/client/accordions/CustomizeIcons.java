package gwtquery.samples.client.accordions;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.plugins.ui.widgets.Accordion.Icons;
import gwtquery.plugins.ui.widgets.Accordion.Options;

import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.Function;
import com.google.gwt.user.client.Event;

public class CustomizeIcons extends AbstractAccordionDemo {

  public CustomizeIcons() {
    super("CustomizeIcons");
  }

  public String getName() {
    return "Customize Icons";
  }

  public void setupDemoElement(final Element demo) {

    final Icons icons = Icons.create().header("ui-icon-circle-arrow-e").headerSelected("ui-icon-circle-arrow-s");
    $("#accordion", demo).as(Ui).accordion(Options.create().icons(icons));

    $("#toggle", demo).as(Ui).button().toggle(new Function() {
      @Override
      public boolean f(Event e) {
        $("#accordion").as(Ui).accordion().option("icons", false);
        return true;
      }

    }, new Function() {
      @Override
      public boolean f(Event e) {
        $("#accordion").as(Ui).accordion().option("icons", icons);
        return true;
      }

    });
  }
}
