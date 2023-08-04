package demo.runtime.impl;

import demo.runtime.DemoProvider;
import io.quarkus.runtime.LaunchMode;

public class DemoCustomProvider implements DemoProvider {

  @Override
  public void printMode() {
    System.out.println("The current class implementation is: " + DemoCustomProvider.class.getName()
        + ", with profile mode is:" + LaunchMode.current().name());
  }
}
