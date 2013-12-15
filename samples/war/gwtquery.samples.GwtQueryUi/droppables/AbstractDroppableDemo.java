package gwtquery.samples.client.droppables;

import gwtquery.samples.client.Demo;

public abstract class AbstractDroppableDemo implements Demo {

  private final String sourceSuffix;

  AbstractDroppableDemo(String suffix) {
    this.sourceSuffix = suffix;
  }

  public String getDemoHtml() {
    return "droppables/" + sourceSuffix + ".html";
  }

  public String getJavaSource() {
    return "droppables/" + sourceSuffix + ".java";
  }

}
