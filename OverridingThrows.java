package HomeWork4Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class OverridingThrows {
    public static void main(String[] args) throws Throwable {
         class Parent {
            // предок пугает IOException и InterruptedException
            public void f(String val) throws IOException, InterruptedException, Throwable {
                try {
                    System.out.println("Parent throw ex = " + val);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }

        class Child extends Parent {
            // а потомок пугает только потомком IOException
            @Override
            public void f(String val) throws Throwable {
                try (BufferedReader reader = new BufferedReader(new FileReader("C://777.txt"))){
                    List list = new ArrayList();
                    String readLiner;
                    while ((readLiner = reader.readLine()) != null) {
                        list.add(readLiner);
                    }
                    System.out.println(list.toString());
                } catch (IOException exception) {
                    //exception.printStackTrace();
                    //exception.fillInStackTrace();
                    //exception.getCause();
                    System.out.println("Ошибка считывания");

                }

            }
        }
        Parent testParent = new Parent();
         testParent.f("parent");
        Parent testChild = new Child();
         testChild.f("child");
    }
}
