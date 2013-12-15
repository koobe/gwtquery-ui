package gwtquery.samples.client.selectables;

import gwtquery.samples.client.DemoPanel;

import com.google.gwt.user.client.ui.HasWidgets;

public class SelectableSamples extends DemoPanel {

  public SelectableSamples(HasWidgets demo) {
    super("Selectables", demo, new Selectables(), new Serialize(), new DisplayAsGrid());
  }
}
