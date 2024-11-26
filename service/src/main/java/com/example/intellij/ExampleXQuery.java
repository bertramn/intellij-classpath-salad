package com.example.intellij;

import net.sf.saxon.Configuration;

public class ExampleXQuery {

  private final net.sf.saxon.Configuration config;

  public ExampleXQuery() {
    this.config = Configuration.newConfiguration();
  }

  @Override
  public String toString() {
    return "config set " + config.toString();
  }

}
