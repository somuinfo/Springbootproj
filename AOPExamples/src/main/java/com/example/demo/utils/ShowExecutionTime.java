package com.example.demo.utils;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.aspectj.lang.annotation.Aspect;

@Retention(RUNTIME)
@Target(METHOD)
@Aspect
public @interface ShowExecutionTime {

}
