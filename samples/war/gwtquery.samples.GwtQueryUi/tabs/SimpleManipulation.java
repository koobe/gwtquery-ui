package gwtquery.samples.client.tabs;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.plugins.ui.widgets.Dialog;
import gwtquery.plugins.ui.widgets.Tabs;
import gwtquery.plugins.ui.widgets.Dialog.Buttons;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.FormElement;
import com.google.gwt.query.client.Function;
import com.google.gwt.query.client.GQuery;
import com.google.gwt.user.client.Event;

public class SimpleManipulation extends AbstractTabsDemo {

  int tab_counter;

  public SimpleManipulation() {
    super("SimpleManipulation");
  }

  public String getName() {
    return "Simple manipulation";
  }

  public void setupDemoElement(final Element demo) {
    final GQuery tab_title_input = $("#tab_title");
    final GQuery tab_content_input = $("#tab_content");
    tab_counter = 2;

    final Function removeTab = new Function() {
      public boolean f(Event close) {
        // Find the tab's index
        int index = $("#tabs li").index($(close).parent().get(0));
        $("#tabs").as(Ui).tabs().remove(index);
        return false;
      };
    };

    // tabs init with a custom tab template and an "add" callback filling in the content
    final Tabs tabs = $("#tabs").as(Ui).tabs( //
    Tabs.Options.create().tabTemplate("<li><a href=\"#{href}\">#{label}</a> <span class=\"ui-icon ui-icon-close\">Remove Tab</span></li>")) //
    .bind(Tabs.Event.add, new Function() {
      @Override
      public boolean f(Event e, Object data) {
        final Tabs.Event event = ((JavaScriptObject) data).cast();
        String tab_content = tab_content_input.val();
        if(tab_content == null || tab_content.isEmpty()) {
          tab_content = "Tab " + tab_counter + " content.";
        }
        $(event.panel()).append("<p>" + tab_content + "</p>");

        // close icon: removing the tab on click
        // note: closable tabs gonna be an option in the future - see http://dev.jqueryui.com/ticket/3924
        $("span.ui-icon-close", event.tab().getParentElement()).click(removeTab);
        return false;
      }
    });

    $("#tabs span.ui-icon-close").click(removeTab);

    final Function addTab = new Function() {
      @Override
      public void f(Element e) {
        String tab_title = tab_title_input.val();
        if(tab_title == null || tab_title.isEmpty()) {
          tab_title = "Tab " + tab_counter;
        }
        tabs.add("#tabs-" + tab_counter, tab_title);
        tab_counter++;
      }
    };

    // modal dialog init: custom buttons and a "close" callback reseting the form inside
    final Dialog dialog = $("#dialog").as(Ui).dialog(Dialog.Options.create().autoOpen(false).modal(true)//
    .buttons(Buttons.create() //
    .define("Add", new Function() {
      public boolean f(Event e) {
        addTab.f((Element) null);
        $("#dialog").as(Ui).dialog().close();
        return false;
      }
    }) //
    .define("Cancel", new Function() {
      public boolean f(Event e) {
        $("#dialog").as(Ui).dialog().close();
        return false;
      }
    })));

    dialog.bind(Dialog.Event.open, new Function() {
      public void f(Element e) {
        tab_title_input.focus();
      };
    })//
    .bind(Dialog.Event.close, new Function() {
      public void f(Element e) {
        FormElement form = $("form", dialog.elements()[0]).elements()[0].cast();
        form.reset();
      };
    });

    // addTab button: just opens the dialog
    $("#add_tab").as(Ui).button().click(new Function() {
      public boolean f(Event e) {
        dialog.open();
        return false;
      };
    });

  }
}
