package com.github.xiaozhiliaoo.refactor;

import java.lang.annotation.*;

/**
 * Refactor about design semll and code(implement) smell
 *
 * @author lili
 * @date 2020/8/17 10:09
 */
@Retention(RetentionPolicy.SOURCE)
@Target({
        ElementType.ANNOTATION_TYPE,
        ElementType.CONSTRUCTOR,
        ElementType.FIELD,
        ElementType.METHOD,
        ElementType.TYPE,
        ElementType.LOCAL_VARIABLE
})
@Documented
public @interface Refactor {

    /**
     * design smell
     *
     * @return bad design smell
     */
    DesignSmell design() default DesignSmell.DO_BETTER;

    /**
     * code smell
     *
     * @return bad code smell
     */
    CodeSmell code() default CodeSmell.DO_BETTER;


    /**
     * design twice to improve quality
     *
     * @return improve list
     */
    String[] improve() default "";

}
