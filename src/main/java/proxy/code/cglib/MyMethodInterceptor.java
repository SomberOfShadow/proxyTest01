package proxy.code.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyMethodInterceptor implements MethodInterceptor {

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("start MyMethodInterceptor.");

        if (method.getName().equals("code")) {
            System.out.println("code method has been interceptered!");
            return "code interceptered";
        }else if (method.getName().equals("debug")) {
            System.out.println("debug method has been interceptered!");
            return "debug interceptered";
        }
//        Object interceptor = methodProxy.invokeSuper(o, objects);
//        return interceptor;
//
        return null;
    }
}
