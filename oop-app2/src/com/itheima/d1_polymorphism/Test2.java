package com.itheima.d1_polymorphism;

public class Test2 {
    public static void main(String[] args) {
        // 目标：掌握使用多态的好处，以及多态下的类型转换问题。
//        People p1 = new Student();
//        p1.run();

//        Teacher t = new Teacher();
//        go(t);

        Student s = new Student();
        go(s);
    }

    public static void go(People p){
        System.out.println("开始------------------------");
        p.run();
        if(p instanceof Student){
            Student s = (Student) p;
            s.study();
        }else if(p instanceof Teacher){
            Teacher t = (Teacher) p;
            t.teach();
        }
        System.out.println("结束------------------------");
    }
}
