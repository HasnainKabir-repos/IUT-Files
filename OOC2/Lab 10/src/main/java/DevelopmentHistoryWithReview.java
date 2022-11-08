import java.lang.annotation.*;
import java.util.ArrayList;
import java.util.List;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})

@Retention(RetentionPolicy.RUNTIME)
@Documented

public @interface DevelopmentHistoryWithReview {
    DevelopmentHistory developmentHistory();
    String[] reviewers();
}
