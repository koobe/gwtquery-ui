package gwtquery.samples.client.accordions;

import gwtquery.samples.client.Demo;

public abstract class AbstractAccordionDemo implements Demo {

  private final String sourceSuffix;

  AbstractAccordionDemo(String suffix) {
    this.sourceSuffix = suffix;
  }

  public String getDemoHtml() {
    return "accordions/" + sourceSuffix + ".html";
  }

  public String getJavaSource() {
    return "accordions/" + sourceSuffix + ".java";
  }

}
