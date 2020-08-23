# @Refactor 

[![Build Status](https://travis-ci.org/xiaozhiliaoo/refactor.svg?branch=master)](https://travis-ci.org/xiaozhiliaoo/refactor)
[![Coverage Status](https://coveralls.io/repos/github/xiaozhiliaoo/refactor/badge.svg?branch=master)](https://coveralls.io/github/xiaozhiliaoo/refactor?branch=master)
[![Maven Central](https://img.shields.io/maven-central/v/com.github.xiaozhiliaoo/refactor)](https://search.maven.org/artifact/com.github.xiaozhiliaoo/refactor/0.0.1/jar)
[![Javadocs](https://img.shields.io/badge/javadoc-0.0.1-brightgreen.svg)](https://javadoc.io/doc/com.github.xiaozhiliaoo/refactor)
[![GitHub issues](https://img.shields.io/github/issues-raw/xiaozhiliaoo/refactor)](https://github.com/xiaozhiliaoo/refactor/issues)
[![GitHub issues](https://img.shields.io/github/issues-closed-raw/xiaozhiliaoo/refactor)](https://github.com/xiaozhiliaoo/refactor/issues/?q=is%3Aissue+is%3Aclosed)


@Refactor improve code design and implement base on java annotation. @Refactor is used to annotate 
public types, interface, class, methods, constructors, and fields to indicate code quality. also 
provide some useful principles to making software clean and better. and make you always remember it.   

## How to use it

The **@Refactor** library is deployed to maven central. You can simply add it as a dependency:

### Apache Maven
```xml
<dependency>
    <groupId>com.github.xiaozhiliaoo</groupId>
    <artifactId>refactor</artifactId>
    <version>0.0.2</version>
</dependency>
```

### Example
1. duplicate abstraction
```java
public interface Service {
    @Refactor(design = DesignSmell.DUPLICATE_ABSTRACTION, improve = "duplicate with formatForAPPList, merge them to one method")
    List<Map<String, Object>> formatForPCList(List<OtcAdvert> list, String langType);
                          
    List<Map<String, Object>> formatForAPPList(List<OtcAdvert> list, String langType); 
}
```



2. break MVC

```java
public class Controller {
    @Refactor(design = DesignSmell.BREAK_MVC, improve = "move controller`s business logic to service layer, keep web layer clean and thin")
    public void doSomething() {   
      // do a lot of thing 
       service.doIt();
      //do a lot of thing
    }   
}

public class Service {
    public void doIt() {
        //only a little business logic
    }
}
```

### Viewpoint

CodeQuality = Design(80%) + Implement(20%) 

good,clean design is more important than code implement.

### TODO

add smell more detail and solution

@Refactor maybe not annotation at interface method, document will be ugly.