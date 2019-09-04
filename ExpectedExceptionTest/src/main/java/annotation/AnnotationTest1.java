package annotation;

/**
 * Created by wangzhen on 2019-09-04
 */
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationTest1 {
    String value(); //value来定义
}