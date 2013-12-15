package gwtquery.samples.client.selectables;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;

import com.google.gwt.dom.client.Element;

public class DisplayAsGrid extends AbstractSelectableDemo {

  public DisplayAsGrid() {
    super("DisplayAsGrid");
  }

  public String getName() {
    return "Display as grid";
  }

  public void setupDemoElement(Element demo) {
    $("#selectable", demo).as(Ui).selectable();
  }
}
