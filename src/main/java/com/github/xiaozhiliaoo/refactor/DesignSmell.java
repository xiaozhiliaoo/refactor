package com.github.xiaozhiliaoo.refactor;

/**
 * 设计上的缺陷一般来自违反软件基本设计原则，比如违反OOD设计，DRY，破坏MVC，破坏分层，低质量抽象，假装封装，不是is-a的继承，
 * 模块化等软件基本设计原则。
 * designSmell更多细节参考 http://www.tusharma.in/smells/DESIGN.html
 *
 * @author lili
 * @date 2020/8/18 11:16
 * @since v1
 */
public enum DesignSmell {
    /**
     * do better
     */
    DO_BETTER,

    /**
     * 破坏MVC分层结构
     */
    BREAK_MVC,

    /**
     * 缺少抽象
     */
    MISSING_ABSTRACTION,

    /**
     * 重复抽象
     */
    DUPLICATE_ABSTRACTION,


    /**
     * 过深的继承结构
     */
    DEEP_HIERARCHY


}