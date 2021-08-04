package Reflect;

import domain.Student;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 框架类
 */
public class demo01{
    public static void main(String[] args) throws Exception {

        //1.加载配置文件
        Properties pro=new Properties();
        //获取目录下的配置文件
        ClassLoader classLoader = demo01.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        //获取配置文件中定义的数据
        String className=pro.getProperty("className");
        String methodName=pro.getProperty("methodName");

        //加载该类进内存
        Class<?> cla = Class.forName(className);
        Object obj = cla.getDeclaredConstructor().newInstance();
        Method method = cla.getMethod(methodName);
        method.invoke(obj);

    }
}