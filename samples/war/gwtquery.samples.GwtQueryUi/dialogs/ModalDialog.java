package gwtquery.samples.client.dialogs;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.plugins.ui.widgets.Dialog;

import com.google.gwt.dom.client.Element;

public class ModalDialog extends AbstractDialogDemo {

  public ModalDialog() {
    super("ModalDialog");
  }

  public String getName() {
    return "Modal dialog";
  }

  public void setupDemoElement(Element demo) {
    $("#dialog-modal", demo).as(Ui).dialog(Dialog.Options.create().height(240).modal(true));
  }
}
