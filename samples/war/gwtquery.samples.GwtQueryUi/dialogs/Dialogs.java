package gwtquery.samples.client.dialogs;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;

import com.google.gwt.dom.client.Element;

public class Dialogs extends AbstractDialogDemo {

  public Dialogs() {
    super("Dialogs");
  }

  public String getName() {
    return "Default Functionality";
  }

  public void setupDemoElement(Element demo) {
    $("#dialog", demo).as(Ui).dialog();
  }
}
