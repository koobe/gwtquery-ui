package gwtquery.samples.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class ViewSourcePanel extends Composite {

  @UiTemplate("ViewSourcePanel.ui.xml")
  interface MyBinder extends UiBinder<Widget, ViewSourcePanel> {
  }

  private static MyBinder uiBinder = GWT.create(MyBinder.class);

  @UiField
  HasText htmlSource;

  @UiField
  HasText javaSource;

  public ViewSourcePanel(Demo demo, String html) {
    initWidget(uiBinder.createAndBindUi(this));
    htmlSource.setText(html);
    fetchJava(demo);
  }

  protected void fetchJava(Demo demo) {
    RequestBuilder rb = new RequestBuilder(RequestBuilder.GET, GWT.getModuleBaseURL() + demo.getJavaSource());
    rb.setCallback(new RequestCallback() {

      public void onResponseReceived(Request request, Response response) {
        javaSource.setText(response.getText());
      }

      public void onError(Request request, Throwable exception) {
      }
    });
    try {
      rb.send();
    } catch(RequestException e) {
      // TODO, tell the user something horrible just happened.
    }
  }
}
