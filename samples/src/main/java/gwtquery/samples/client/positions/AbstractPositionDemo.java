package gwtquery.samples.client.positions;

import gwtquery.samples.client.Demo;

public abstract class AbstractPositionDemo implements Demo {

  private final String sourceSuffix;

  AbstractPositionDemo(String suffix) {
    this.sourceSuffix = suffix;
  }

  public String getDemoHtml() {
    return "positions/" + sourceSuffix + ".html";
  }

  public String getJavaSource() {
    return "positions/" + sourceSuffix + ".java";
  }

}
