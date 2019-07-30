package com.ssm.demo.util.lambda;

import java.lang.annotation.*;

@Repeatable(value = Persons.class)
public @interface Person {
      String role() default "Doctor";
}
