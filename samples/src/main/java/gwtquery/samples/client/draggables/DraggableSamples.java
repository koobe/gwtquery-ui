package gwtquery.samples.client.draggables;

import gwtquery.samples.client.DemoPanel;

import com.google.gwt.user.client.ui.HasWidgets;

public class DraggableSamples extends DemoPanel {

  public DraggableSamples(HasWidgets demo) {
    super("Draggables", demo, new Draggables(), new Event());
  }
}
