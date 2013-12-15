package gwtquery.samples.client.dialogs;

import gwtquery.samples.client.Demo;

public abstract class AbstractDialogDemo implements Demo {

  private final String sourceSuffix;

  AbstractDialogDemo(String suffix) {
    this.sourceSuffix = suffix;
  }

  public String getDemoHtml() {
    return "dialogs/" + sourceSuffix + ".html";
  }

  public String getJavaSource() {
    return "dialogs/" + sourceSuffix + ".java";
  }

}
