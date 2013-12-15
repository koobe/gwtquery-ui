package gwtquery.samples.client.buttons;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.plugins.ui.widgets.Button;

import com.google.gwt.dom.client.Element;

public class Icons extends AbstractButtonDemo {

  public Icons() {
    super("Icons");
  }

  public String getName() {
    return "Icons";
  }

  public void setupDemoElement(Element demo) {
    $("button", demo) //
    .eq(0).as(Ui).button(Button.Options.create().icons(Button.Icons.create().primary("ui-icon-locked")).text(false)) //
    .next().as(Ui).button("{icons: {primary: 'ui-icon-locked'}}") //
    .next().as(Ui).button(Button.Options.create().icons(Button.Icons.create().primary("ui-icon-gear").secondary("ui-icon-triangle-1-s"))) //
    .next().as(Ui).button("{icons: {primary: 'ui-icon-gear',secondary: 'ui-icon-triangle-1-s'}, text: false}");
  }

}
