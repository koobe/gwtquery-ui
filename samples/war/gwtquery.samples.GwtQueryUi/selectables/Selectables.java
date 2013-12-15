package gwtquery.samples.client.selectables;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;

import com.google.gwt.dom.client.Element;

public class Selectables extends AbstractSelectableDemo {

  public Selectables() {
    super("Selectables");
  }

  public String getName() {
    return "Default Functionality";
  }

  public void setupDemoElement(Element demo) {
    $("#selectable", demo).as(Ui).selectable();
  }
}
