package com.codegym;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student student1 = new Student(111, "Hoang");
        Student student2 = new Student(222, "Lien");
        Student student3 = new Student(222, "Son");

        student1.display();
        student2.display();
        student3.display();

    }
}
