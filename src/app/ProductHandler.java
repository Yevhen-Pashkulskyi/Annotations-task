package app;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

public class ProductHandler {

    public static void main(String[] args) throws  {
        new ProductInfo();
        Class<ProductInfo> infoClass = .class;
        getAnnot(infoClass);
        Method method = infoClass.getMethod();
        getAnnot(method);
    }

    static void getAnnot(AnnotatedElement element) {

        try  {

            Annotation[] annotations = element.getAnnotations();

            for (Annotation annotation : annotations) {
                if (annotation instanceof Product product) {
                    System.out.printf("Product: %s, quota: %d%n",
                            );
                }
            }
        } catch (Exception e) {

        }
    }
}
