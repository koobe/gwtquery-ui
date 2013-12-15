package gwtquery.samples.client.sliders;

import gwtquery.samples.client.Demo;

public abstract class AbstractSliderDemo implements Demo {

  private final String sourceSuffix;

  AbstractSliderDemo(String suffix) {
    this.sourceSuffix = suffix;
  }

  public String getDemoHtml() {
    return "sliders/" + sourceSuffix + ".html";
  }

  public String getJavaSource() {
    return "sliders/" + sourceSuffix + ".java";
  }

}
