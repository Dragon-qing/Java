package annotation;

import domain.Calculator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

public class testCheck {
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        Class<? extends Calculator> aClass = calculator.getClass();
        Method[] methods = aClass.getMethods();

        int number=0;
        BufferedWriter br=new BufferedWriter(new FileWriter("bug.txt"));

        for (Method method : methods) {
            if(method.isAnnotationPresent(Check.class)){
                try{
                    method.invoke(calculator);

                }catch (Exception e){
                    number++;
                    br.write(method.getName()+"方法异常");
                    br.newLine();
                    br.write("异常名称"+e.getCause().getClass().getSimpleName());
                    br.newLine();
                    br.write("异常原因"+e.getCause().getMessage());
                    br.newLine();
                }
            }
        }
        br.write("共有"+number+"个异常");
        br.newLine();
        br.flush();
        br.close();


    }
}
