package proxy.code.bytebuddy;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.matcher.ElementMatchers;
import org.junit.Assert;
import org.junit.Test;


public class ByteBuddyTestTest {
    @Test
    public void helloWorldTest() throws IllegalAccessException, InstantiationException {
        Class<?> dynamicType = new ByteBuddy()
                .subclass(Object.class)
                .method(ElementMatchers.named("toString"))
                .intercept(FixedValue.value("Hello World!"))
                .make()
                .load(getClass().getClassLoader())
                .getLoaded();
        String str = dynamicType.newInstance().toString();
        System.out.println(str);
        Assert.assertEquals("toString方法改写错误", str, "Hello World!");
    }

}