package gwtquery.samples.client.buttons;

import gwtquery.samples.client.Demo;

public abstract class AbstractButtonDemo implements Demo {

  private final String sourceSuffix;

  AbstractButtonDemo(String suffix) {
    this.sourceSuffix = suffix;
  }

  public String getDemoHtml() {
    return "buttons/" + sourceSuffix + ".html";
  }

  public String getJavaSource() {
    return "buttons/" + sourceSuffix + ".java";
  }

}
