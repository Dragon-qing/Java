package annotation;

/**
 * jdk内置注解
 * @Override ：检测被该注解标注的方法是否是继承自父类的
 * @Deprecated ：该注解标注的内容，表示已经过时
 * @SuppressWarnings ：压制警告
 */
@SuppressWarnings("all")
public class Demo02 {
    @Override
    public String toString(){
        return super.toString();
    }
    @Deprecated
    public void run1(){

    }
    @MyAnnotation(value=12,name="xhw")
    public void run2(){
        run1();
    }

    public static void main(String[] args) {

    }
}
