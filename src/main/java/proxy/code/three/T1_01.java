package proxy.code.three;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class T1_01 implements InvocationHandler {
    private T1_00 t1_00;

    public T1_01(T1_00 t1_00) {
        this.t1_00 = t1_00;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before aaa");
        method.invoke(t1_00, args);
        System.out.println("after aaa");
        return proxy;
    }
}
