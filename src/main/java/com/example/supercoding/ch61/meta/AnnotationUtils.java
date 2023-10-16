package com.example.supercoding.ch61.meta;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationUtils {
    public static void executeMethodsByRepeatAnnotation(Object object) { //메서드 정보에 annotation을 가지고 프로그래밍
        Class clazz = object.getClass();
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            Annotation[] annotations = method.getDeclaredAnnotations();

            for (Annotation annotation : annotations) {
                if (annotation instanceof Repeat) {
                    Repeat repeatAnnotation = (Repeat) annotation;
                    int repeatCount = repeatAnnotation.value();

                    for (int i = 0; i < repeatCount; i++) {
                        try {
                            method.invoke(object);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

}
