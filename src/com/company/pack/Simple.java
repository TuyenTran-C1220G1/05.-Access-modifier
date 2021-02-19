package com.company.pack;

import com.company.mypack.A;

public class Simple extends A {
    public static void main(String[] args) {
        Simple object = new Simple();
        System.out.println(object.data);
        object.msg();
    }
}
