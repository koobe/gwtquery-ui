package gwtquery.samples.client.draggables;

import gwtquery.samples.client.Demo;

public abstract class AbstractDraggableDemo implements Demo {

  private final String sourceSuffix;

  AbstractDraggableDemo(String suffix) {
    this.sourceSuffix = suffix;
  }

  public String getDemoHtml() {
    return "draggables/" + sourceSuffix + ".html";
  }

  public String getJavaSource() {
    return "draggables/" + sourceSuffix + ".java";
  }

}
