package gwtquery.samples.client.datepickers;

import gwtquery.samples.client.Demo;

public abstract class AbstractDatepickerDemo implements Demo {

  private final String sourceSuffix;

  AbstractDatepickerDemo(String suffix) {
    this.sourceSuffix = suffix;
  }

  public String getDemoHtml() {
    return "datepickers/" + sourceSuffix + ".html";
  }

  public String getJavaSource() {
    return "datepickers/" + sourceSuffix + ".java";
  }

}
