package gwtquery.samples.client.progressbars;

import gwtquery.samples.client.Demo;

public abstract class AbstractProgressbarDemo implements Demo {

  private final String sourceSuffix;

  AbstractProgressbarDemo(String suffix) {
    this.sourceSuffix = suffix;
  }

  public String getDemoHtml() {
    return "progressbars/" + sourceSuffix + ".html";
  }

  public String getJavaSource() {
    return "progressbars/" + sourceSuffix + ".java";
  }

}
