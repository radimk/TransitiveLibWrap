package bundle2;

import testlib.TestClass;

public class SomeClass {

  public void doIt() {
    System.out.println("From testlib: " + new TestClass().hello());
  }
}
