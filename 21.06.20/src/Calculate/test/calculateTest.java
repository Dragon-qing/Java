package Calculate.test;

import Calculate.Calculate;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class calculateTest {
    Calculate cal;
    /**
     * 初始化方法
     * 用于资源申请，所有测试方法在执行之前都会先执行该方法
     */
    @Before
    public void init(){
        cal=new Calculate();
        System.out.println("初始化完成");
    }

    /**
     * 释放资源方法
     * 在所有测试方法执行完后，都会自动执行该方法
     */
    @After
    public void close(){
        System.out.println("测试完成");
    }
    /**
     * 测试add方法
     */
    @Test
    public void testAdd(){
        int result = cal.add(1, 2);
        Assert.assertEquals(3,result);
    }
    /**
     * 测试sub方法
     */
    @Test
    public void testSub(){
        int result=cal.sub(1,2);
        Assert.assertEquals(-1,result);
    }
}
