package annotation;

/**
 * Created by wangzhen on 2019-09-03
 */
public class Test {
    @AnnotationTest1(value = "小云") //引用注解进行赋值
    public String name;

    @AnnotationTest2 //目的获取该AnnotationTest2
    public void fun() {
        System.out.println("方法执行");
    }
}
