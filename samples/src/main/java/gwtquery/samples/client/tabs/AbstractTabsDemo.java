package gwtquery.samples.client.tabs;

import gwtquery.samples.client.Demo;

public abstract class AbstractTabsDemo implements Demo {

  private final String sourceSuffix;

  AbstractTabsDemo(String suffix) {
    this.sourceSuffix = suffix;
  }

  public String getDemoHtml() {
    return "tabs/" + sourceSuffix + ".html";
  }

  public String getJavaSource() {
    return "tabs/" + sourceSuffix + ".java";
  }

}
