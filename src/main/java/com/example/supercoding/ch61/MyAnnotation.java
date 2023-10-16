package com.example.supercoding.ch61;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
public @interface MyAnnotation {
    String name();
    int count() default 0;

}
