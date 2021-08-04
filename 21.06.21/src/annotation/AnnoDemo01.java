package annotation;

/**
 * 注解
 * @author wmx
 * @since 1.5
 * @version 0.1
 *
 */
@MyAnno3
public class AnnoDemo01 {

    int age;
    String name;
    /**
     * 计算两数的和
     * @param a 整数
     * @param b 整数
     * @return a+b
     */
    @MyAnno3
    public int add(int a,int b){
        return a+b;
    }
}
