package org.engineering.refactor;

import java.lang.annotation.*;

/**
 * 重构注解，主要重构两点：1 代码设计 2 代码实现
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
     * 设计上的问题需要重构的点
     *
     * @return 坏设计气味
     */
    DesignSmell design() default DesignSmell.DO_BETTER;

    /**
     * 代码上的问题需要重构的点
     *
     * @return 坏代码的气味
     */
    CodeSmell code() default CodeSmell.DO_BETTER;


    /**
     * 还能提高的点有哪些？
     *
     * @return 提高点
     */
    String[] improve() default "";

}
