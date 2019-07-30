package com.ssm.demo.util.test;

import com.ssm.demo.entity.David;
import com.ssm.demo.entity.Lily;
import com.ssm.demo.util.lambda.Person;
import com.ssm.demo.util.lambda.Persons;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

public class PersonTest {

    public static void main(String[] args) {

        Annotation[] lily = Lily.class.getAnnotations();
        Arrays.stream(lily).forEach(System.out::println);

        Persons persons =  Lily.class.getAnnotation(Persons.class);
        System.out.println(((Person[])persons.value())[0].role());

        Annotation[] david = David.class.getAnnotations();
        Arrays.stream(david).forEach(System.out::println);

    }


    @SafeVarargs
    public static void getBooks(List<String>... args){
        System.out.println(args[0].get(0));
    }
}
