package com.github.xiaozhiliaoo.refactor;

import java.lang.annotation.*;

/**
 * Refactor about design smell and code(implement) smell
 *
 * @author lili
 * @since 0.0.1
 */
@Retention(RetentionPolicy.SOURCE)
@Target({
        ElementType.ANNOTATION_TYPE,
        ElementType.CONSTRUCTOR,
        ElementType.FIELD,
        ElementType.METHOD,
        ElementType.PARAMETER,
        ElementType.TYPE,
        ElementType.LOCAL_VARIABLE
})
@Documented
public @interface Refactor {

    /**
     * basic software design principle
     *
     * @return principle
     */
    Principle principle() default Principle.DO_BETTER;

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
