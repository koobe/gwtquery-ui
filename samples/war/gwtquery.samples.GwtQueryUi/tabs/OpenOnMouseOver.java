package gwtquery.samples.client.tabs;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.plugins.ui.widgets.Tabs;

import com.google.gwt.dom.client.Element;

public class OpenOnMouseOver extends AbstractTabsDemo {

  public OpenOnMouseOver() {
    super("OpenOnMouseOver");
  }

  public String getName() {
    return "Open on mouseover";
  }

  public void setupDemoElement(final Element demo) {
    $("#tabs", demo).as(Ui).tabs(Tabs.Options.create().event("mouseover"));
  }
}
