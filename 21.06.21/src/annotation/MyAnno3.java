package annotation;

import java.lang.annotation.*;

@Target(value={ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})//只能作用于类上
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnno3 {
}
