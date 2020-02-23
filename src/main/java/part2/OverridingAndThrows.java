package part2;

import java.io.FileNotFoundException;
import java.io.IOException;


public class OverridingAndThrows {
    public class Parent{
        public void f() throws IOException,InterruptedException {}
    }
    public class Child extends Parent{
        @Override
        public void f() throws FileNotFoundException {
        }

    }
}
