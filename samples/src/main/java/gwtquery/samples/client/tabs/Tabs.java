package gwtquery.samples.client.tabs;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;

import com.google.gwt.dom.client.Element;

public class Tabs extends AbstractTabsDemo {

  public Tabs() {
    super("Tabs");
  }

  public String getName() {
    return "Default Functionality";
  }

  public void setupDemoElement(Element demo) {
    $("#tabs", demo).as(Ui).tabs();
  }
}
