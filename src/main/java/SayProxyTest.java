import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SayProxyTest {
    public static void main(String[] args) {

//        List<String> list = new LinkedList<String>();
//        try {
//            Method method = list.getClass().getMethod("get", null);
//            Class<?> returnType = method.getReturnType();
//            System.out.println(" returnType: " + returnType);
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }


        Say say = new TomSay();

        InvocationHandler handler = new SayHandler(say);

        Say proxy = (Say) Proxy.newProxyInstance(handler.getClass().getClassLoader(), say.getClass().getInterfaces(), handler);
        proxy.sayYes();


    }
}
