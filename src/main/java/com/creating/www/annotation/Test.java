package com.creating.www.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.SOURCE;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(SOURCE)
@Target(FIELD)
public @interface Test {
	int x() default 1;

	int[] xArray();

	float y() default 0;
}
