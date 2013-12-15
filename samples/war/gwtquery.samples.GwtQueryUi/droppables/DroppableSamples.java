package gwtquery.samples.client.droppables;

import gwtquery.samples.client.DemoPanel;

import com.google.gwt.user.client.ui.HasWidgets;

public class DroppableSamples extends DemoPanel {

  public DroppableSamples(HasWidgets demo) {
    super("Droppables", demo, new Droppables(), new AcceptedElements(), new PreventPropagation(), new VisualFeedback(), new Revert(), new ShoppingCart());
  }
}
