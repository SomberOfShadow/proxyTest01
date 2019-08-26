package proxy.code.three;

import javassist.util.proxy.MethodHandler;

import java.lang.reflect.Method;

public class T3_01 implements MethodHandler {
    private T3 t3;

    public T3_01(T3 t3) {
        this.t3 = t3;
    }

    public Object invoke(Object o, Method method, Method method1, Object[] objects) throws Throwable {
        System.out.println("before ccc");
        method.invoke(t3, objects);
        System.out.println("after ccc");
        return o;
    }
}
