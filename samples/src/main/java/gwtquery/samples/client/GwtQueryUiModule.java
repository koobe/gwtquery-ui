package gwtquery.samples.client;

import gwtquery.samples.client.accordions.AccordionSamples;
import gwtquery.samples.client.buttons.ButtonSamples;
import gwtquery.samples.client.datepickers.DatepickerSamples;
import gwtquery.samples.client.dialogs.DialogSamples;
import gwtquery.samples.client.draggables.DraggableSamples;
import gwtquery.samples.client.droppables.DroppableSamples;
import gwtquery.samples.client.positions.PositionSamples;
import gwtquery.samples.client.progressbars.ProgressbarSamples;
import gwtquery.samples.client.selectables.SelectableSamples;
import gwtquery.samples.client.sliders.SliderSamples;
import gwtquery.samples.client.tabs.TabsSamples;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

public class GwtQueryUiModule implements EntryPoint {

  @UiTemplate("GwtQueryUiModule.ui.xml")
  interface Binder extends UiBinder<Widget, GwtQueryUiModule> {
  }

  private static Binder uiBinder = GWT.create(Binder.class);

  private final Widget app;

  @UiField
  FlowPanel demos;

  @UiField
  HasWidgets demo;

  public GwtQueryUiModule() {
    app = uiBinder.createAndBindUi(this);
  }

  public void onModuleLoad() {
    demos.add(new DraggableSamples(demo));
    demos.add(new DroppableSamples(demo));
    demos.add(new SelectableSamples(demo));
    demos.add(new AccordionSamples(demo));
    demos.add(new ButtonSamples(demo));
    demos.add(new DatepickerSamples(demo));
    demos.add(new DialogSamples(demo));
    demos.add(new ProgressbarSamples(demo));
    demos.add(new SliderSamples(demo));
    demos.add(new TabsSamples(demo));
    demos.add(new PositionSamples(demo));

    LayoutPanel layout = RootLayoutPanel.get();
    layout.add(app);
    layout.setWidgetLeftRight(app, 15, Unit.PCT, 15, Unit.PCT);
    layout.setWidgetTopBottom(app, 1, Unit.EM, 1, Unit.EM);
  }

}