package proxy.code.three;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class T2_01 implements MethodInterceptor {
    private T2 t2;

    public T2_01(T2 t2) {
        this.t2 = t2;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before bbb");
        method.invoke(t2, objects);
        System.out.println("after bbb");
        return o;
    }
}
