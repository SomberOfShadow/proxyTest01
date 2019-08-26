package proxy.code.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 *  @Description: DeveloperProxyTest 使用JDK的反射机制实现动态代理
 *  @ClassName: DeveloperProxyTest
 *  @author: eenheni
 *  @Date: 7/5/2019 1:54 PM
 */
public class DeveloperProxyTest {


    public static void main(String[] args) {
//        javadeveloper javadeveloper = new javadeveloper("tom");
        JavaDeveloper javadeveloper = new JavaDeveloper("jim");
        InvocationHandler handler = new DeveloperHander(javadeveloper);

        Develpoer proxy = (Develpoer) Proxy.newProxyInstance(handler.getClass().getClassLoader(),
                javadeveloper.getClass().getInterfaces(), handler);

        proxy.code();
        proxy.debug();


    }
}
