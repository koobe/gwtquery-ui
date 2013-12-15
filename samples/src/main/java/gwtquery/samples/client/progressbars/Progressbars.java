package gwtquery.samples.client.progressbars;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.plugins.ui.widgets.Progressbar;

import com.google.gwt.dom.client.Element;

public class Progressbars extends AbstractProgressbarDemo {

  public Progressbars() {
    super("Progressbars");
  }

  public String getName() {
    return "Default Functionality";
  }

  public void setupDemoElement(Element demo) {
    $("#progressbar", demo).as(Ui).progressbar(Progressbar.Options.create().value(37));
  }
}
