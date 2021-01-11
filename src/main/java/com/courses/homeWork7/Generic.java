package com.courses.homeWork7;

public class Generic<T, V, K> {
    T object1;
    V object2;
    K object3;

    public Generic(T object1, V object2, K object3) {
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
    }

    public void print() {
        System.out.println(object1);
        System.out.println(object2);
        System.out.println(object3);
    }
}
