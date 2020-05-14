package com.training.design.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Subject 의 factory 역할을 한다.
 * */
public class FlyWeight {
    Map<String, Subject> cache = new HashMap<>();

    // Multi thread 환경에서는 synchronize 처리가 필요함.
    public Subject getSubject(String name) {
        Subject subject = cache.get(name);

        if (subject == null) {
            subject = new Subject(name);
            cache.put(name, subject);
        }
        return subject;
    }
}


class Subject {
    private String name;

    public Subject(String name) {
        this.name = name;
        System.out.println("create : " + name);
    }
}


