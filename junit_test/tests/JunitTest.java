package tests;

import junit_test.Junit;
import org.junit.*;

/**
 * 测试程序
 * Created by ustcck on 2016/8/18.
 */

public class JunitTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("Before");
    }

    @Test
    public void testAdd() throws Exception {
        Junit test = new Junit();
        test.testAdd(2,3);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After");
    }
}