package gwtquery.samples.client.dialogs;

import gwtquery.samples.client.DemoPanel;

import com.google.gwt.user.client.ui.HasWidgets;

public class DialogSamples extends DemoPanel {

  public DialogSamples(HasWidgets demo) {
    super("Dialogs", demo, new Dialogs(), new Animated(), new ModalDialog(), new ModalMessage());
  }
}
