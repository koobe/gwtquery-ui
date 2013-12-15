package gwtquery.samples.client.selectables;

import gwtquery.samples.client.Demo;

public abstract class AbstractSelectableDemo implements Demo {

  private final String sourceSuffix;

  AbstractSelectableDemo(String suffix) {
    this.sourceSuffix = suffix;
  }

  public String getDemoHtml() {
    return "selectables/" + sourceSuffix + ".html";
  }

  public String getJavaSource() {
    return "selectables/" + sourceSuffix + ".java";
  }

}
