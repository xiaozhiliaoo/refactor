package com.github.xiaozhiliaoo.refactor;

/**
 * design smell often from violate base software design principle.
 * violate ood,dry,break mvc, break layer, low quality abstract,
 * lack encapsulation,inheritance,modularization.
 * reference:http://www.tusharma.in/smells/DESIGN.html
 *
 * @author lili
 * @since 0.0.1
 */
public enum DesignSmell {
    /**
     * do better
     */
    DO_BETTER,

    /**
     * BREAK_MVC
     */
    BREAK_MVC,

    /**
     * MISSING_ABSTRACTION
     */
    MISSING_ABSTRACTION,

    /**
     * DUPLICATE_ABSTRACTION
     */
    DUPLICATE_ABSTRACTION,


    /**
     * DEEP_HIERARCHY
     */
    DEEP_HIERARCHY


}