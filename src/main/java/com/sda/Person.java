package com.sda;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
public class Person {

    private String name;
     private String surname;

     @Setter
     private int age;
}
