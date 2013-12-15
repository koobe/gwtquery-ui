package gwtquery.samples.client.tabs;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.plugins.ui.widgets.Tabs;

import com.google.gwt.dom.client.Element;

public class Collapsible extends AbstractTabsDemo {

  public Collapsible() {
    super("Collapsible");
  }

  public String getName() {
    return "Collapse content";
  }

  public void setupDemoElement(final Element demo) {
    $("#tabs", demo).as(Ui).tabs(Tabs.Options.create().collapsible(true));
  }
}
