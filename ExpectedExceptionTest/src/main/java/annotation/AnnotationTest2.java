package annotation;

/**
 * Created by wangzhen on 2019-09-04
 */
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AnnotationTest2 {
    //todo无任何方法或者属性
}