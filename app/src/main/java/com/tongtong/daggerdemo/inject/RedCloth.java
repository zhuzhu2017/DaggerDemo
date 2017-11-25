package com.tongtong.daggerdemo.inject;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by allen on 2017/11/25.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface RedCloth {
}
