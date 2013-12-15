package gwtquery.samples.client.dialogs;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.plugins.ui.widgets.Dialog;
import gwtquery.plugins.ui.widgets.Dialog.Buttons;

import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.Function;
import com.google.gwt.user.client.Event;

public class ModalMessage extends AbstractDialogDemo {

  public ModalMessage() {
    super("ModalMessage");
  }

  public String getName() {
    return "Modal message";
  }

  public void setupDemoElement(Element demo) {
    $("#dialog-message", demo).as(Ui).dialog(//
    Dialog.Options.create().modal(true)//
    .buttons(Buttons.create()//
    .define("Ok", new Function() {
      @Override
      public boolean f(Event e) {
        // we can't use $(this)
        $("#dialog-message").as(Ui).dialog().close();
        return false;
      }
    })));
  }
}
