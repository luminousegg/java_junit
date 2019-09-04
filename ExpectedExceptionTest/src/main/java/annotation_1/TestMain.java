package annotation_1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by wangzhen on 2019-09-04
 */
public class TestMain {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        Method[] methods = myTest.getClass().getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            Method method = methods[i];
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                try {
                    method.setAccessible(true);
                    method.invoke(myTest, null);//调用该类的注解方法
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("==================输出完成！====================");
    }
}
