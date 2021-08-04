package Reflect;

import annotation.Pro;
import java.lang.reflect.Method;

@Pro(className="domain.Student",methodName = "run")
public class Demo02 {
    public static void main(String[] args) throws Exception {
        Class<Demo02> demo02Class = Demo02.class;
        Pro annotation = demo02Class.getAnnotation(Pro.class);
        String cn = annotation.className();
        String mn = annotation.methodName();

        Class<?> aClass = Class.forName(cn);
        Object obj = aClass.getDeclaredConstructor().newInstance();
        Method method = aClass.getMethod(mn);
        method.invoke(obj);
    }
}
