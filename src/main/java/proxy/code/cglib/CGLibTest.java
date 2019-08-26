package proxy.code.cglib;

import net.sf.cglib.proxy.Enhancer;
import proxy.code.jdk.JavaDeveloper;

public class CGLibTest {
    public static void main(String[] args) {
        MyMethodInterceptor myMethodInterceptor = new MyMethodInterceptor();

        Enhancer enhancer = new Enhancer();
//        JavaDeveloper java = new JavaDeveloper("tom");
//        enhancer.setSuperclass(java.getClass());

        enhancer.setSuperclass(JavaDeveloper.class);

        enhancer.setCallback(myMethodInterceptor);

        JavaDeveloper javaDeveloper = (JavaDeveloper) enhancer.create();
//
//        javaDeveloper.setName("tom");
//        System.out.println(javaDeveloper.getName());

        javaDeveloper.code();
        javaDeveloper.debug();

    }
}
