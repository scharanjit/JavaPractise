/*
ADVANTAGE
Annotations have a lot of advantages over XML, to name a few :

Static type checking - the compiler will check for you where the annotation 
(once defined properly) is applicable and how

Clean code - its much easier to see (visually) the meta data defined in annotations

However it comes at a price:

XML doesn't require recompilation when you want to change something. With
annotation you'll have to recompile.
 */

package z.prm.twothree;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Charanjit.Singh
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test {
   String info() default "";
}
class Annotated {
   @Test(info = "AWESOME")
   public void foo(String myParam) {
      System.out.println("This is " + myParam);
   }
}
class TestAnnotationParser {
   public void parse(Class<?> clazz) throws Exception {
      Method[] methods = clazz.getMethods();
      for (Method method : methods) {
         if (method.isAnnotationPresent(Test.class)) {
            Test test = method.getAnnotation(Test.class);
            String info = test.info();
            if ("AWESOME".equals(info)) {
                try {
                    System.out.println("info is awesome!");
                    try {
                        // try to invoke the method with param
                        method.invoke(
                                Annotated.class.newInstance(),info
                        );
                    } catch (InstantiationException ex) {
                        Logger.getLogger(TestAnnotationParser.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(TestAnnotationParser.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalArgumentException ex) {
                    Logger.getLogger(TestAnnotationParser.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvocationTargetException ex) {
                    Logger.getLogger(TestAnnotationParser.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
         }
      }
   }
}
public class Demo {
   public static void main(String[] args) throws Exception {
      TestAnnotationParser parser = new TestAnnotationParser();
      parser.parse(Annotated.class);
   }
}