package gwtquery.samples.client.tabs;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;

import com.google.gwt.dom.client.Element;

public class Sortable extends AbstractTabsDemo {

  public Sortable() {
    super("Sortable");
  }

  public String getName() {
    return "Sortable";
  }

  public void setupDemoElement(final Element demo) {
    $("#tabs", demo).as(Ui).tabs().find(".ui-tabs-nav").as(Ui).sortable("{axis:'x'}");
  }
}
