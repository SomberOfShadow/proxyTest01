package proxy.code.three;

import javassist.util.proxy.ProxyFactory;
import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

public class MyProxyTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

//        Jdk 简单但是必须继承接口
       T1_00 t1_00 = new T1_00();
       T1_01 t1_01 = new T1_01(t1_00);
       T1 t1 = (T1) Proxy.newProxyInstance(t1_01.getClass().getClassLoader(), t1_00.getClass().getInterfaces(), t1_01);
       t1.say();

//       CGlib
        T2 t2 = new T2();
        T2_01 t2_01 = new T2_01(t2);
//        new T2_01(new T2());

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(T2.class);
        enhancer.setCallback(t2_01);
        T2 t21 = (T2) enhancer.create();
        t21.say();

//        javaasist
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setSuperclass(T3.class);
//        proxyFactory.setFilter(new MethodFilter() {
//            public boolean isHandled(Method method) {
//                return false;
//            }
//        });
        proxyFactory.setHandler(new T3_01(new T3()));
        T3 t3 = (T3) proxyFactory.createClass().newInstance();
        t3.say();
    }
}
