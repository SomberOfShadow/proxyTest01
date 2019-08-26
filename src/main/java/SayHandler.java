import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SayHandler implements InvocationHandler {
    private Object object;

    public SayHandler(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置代理");
        Object result=method.invoke(this.object, args);
        System.out.println("后置代理");
        return result;
    }
}
