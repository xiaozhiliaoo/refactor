package com.github.xiaozhiliaoo.refactor;

/**
 * design smell often from violate base software design principle.
 * violate ood,dry,break mvc, break layer, low quality abstract,
 * lack encapsulation,inheritance,modularization.
 * reference:http://www.tusharma.in/smells/DESIGN.html
 * AntiPatterns: Refactoring Software, Architectures, and Projects in Crisis
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


    IMPERATIVE_ABSTRACTION,


    INCOMPLETE_ABSTRACTION,


    MULTIFACETED_ABSTRACTION,


    UNNECESSARY_ABSTRACTION,


    UNUTILIZED_ABSTRACTION,


    DUPLICATE_ABSTRACTION,


    DEFICIENT_ENCAPSULATION,


    LEAKY_ENCAPSULATION,


    MISSING_ENCAPSULATION,


    UNEXPLOITED_ENCAPSULATION,


    BROKEN_MODULARIZATION,


    INSUFFICIENT_MODULARIZATION,

    CYCLICALLY_DEPENDENT_MODULARIZATION,

    HUB_LIKE_MODULARIZATION,

    MISSING_HIERARCHY,

    UNNECESSARY_HIERARCHY,

    UNFACTORED_HIERARCHY,

    WIDE_HIERARCHY,

    SPECULATIVE_HIERARCHY,

    DEEP_HIERARCHY,

    REBELLIOUS_HIERARCHY,

    BROKEN_HIERARCHY,

    MULTIPATH_HIERARCHY,

    CYCLIC_HIERARCHY,

    THE_BLOB,

    LAVA_FLOW,


    FUNCTIONAL_DECOMPOSITION,

    POLTERGEEIST,

    GOLDEN_HAMMER,

    SPAGHETTI_CODE,

    CUT_AND_PASTE_PROGRAMMING,

}