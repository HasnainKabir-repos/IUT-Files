package Annotations;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface BuilderHistory {
    String builderName();
    int phoneNumber();
}
