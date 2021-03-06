package com.vaadin.spring.tutorial;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;

@SpringComponent
@UIScope
public class HelloBean {
    public String getMessage() {
        return "Hello from bean " + toString();
    }
}
