package annotation_1;

import java.lang.annotation.*;

/**
 * Created by wangzhen on 2019-09-04
 */

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
}
