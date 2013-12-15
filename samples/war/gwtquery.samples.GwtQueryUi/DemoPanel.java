package gwtquery.samples.client;

import static com.google.gwt.query.client.GQuery.$;

import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.query.client.Function;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

public class DemoPanel extends Composite {

  @UiTemplate("DemoPanel.ui.xml")
  interface MyBinder extends UiBinder<Widget, DemoPanel> {
  }

  private static MyBinder uiBinder = GWT.create(MyBinder.class);

  @UiField
  HTMLPanel html;

  public DemoPanel(String title, final HasWidgets demo, Demo... demos) {
    initWidget(uiBinder.createAndBindUi(this));
    $("h3", html.getElement()).text(title);
    for(final Demo d : demos) {
      $("ul", html.getElement()).append($("<li><a href=\"#\">" + d.getName() + "</a></li>").click(new Function() {
        @Override
        public boolean f(Event e) {
          demo.clear();
          fetchHtml(d, new RequestCallback() {

            public void onResponseReceived(Request request, Response response) {
              String html = response.getText();
              HTMLPanel p = new HTMLPanel(html);
              demo.add(p);
              d.setupDemoElement($(".demo", p.getElement()).elements()[0]);
              demo.add(new ViewSourcePanel(d, html));
            }

            public void onError(Request request, Throwable exception) {
              // TODO, tell the user something horrible just happened.
            }
          });
          return false;
        }
      }));
    }
  }

  protected void fetchHtml(Demo demo, RequestCallback htmlCallback) {
    RequestBuilder rb = new RequestBuilder(RequestBuilder.GET, GWT.getModuleBaseURL() + demo.getDemoHtml());
    rb.setCallback(htmlCallback);
    try {
      rb.send();
    } catch(RequestException e) {
      // TODO, tell the user something horrible just happened.
    }
  }
}
