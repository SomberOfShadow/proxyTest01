package proxy.code.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DeveloperHander implements InvocationHandler {

    private Object object;

    public DeveloperHander(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("code")) {
            System.out.println("jim is praying before coding.");
            Object result = method.invoke(this.object);
            return result;
        }else if(method.getName().equals("debug")) {
            System.out.println("jim is praying before debuging.");
            Object result = method.invoke(this.object);
            return result;
        }
        return null;
    }
}
