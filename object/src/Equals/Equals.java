package Equals;

import java.util.Objects;

public class Equals {
    public static void main(String[] args) {
//        String str1 = "zxc";
//        String str2 = "zxc";
//        System.out.println(str1 == str2); // true
//        System.out.println(str1.equals(str2)); // true

//        String str1 = "zxc";
//        String str2 = new String("zxc");
//        the "==" is compare the address, while the equals of String is compare the value
//        System.out.println(str1 == str2); // false
//        System.out.println(str1.equals(str2)); // true
//        System.out.println(str2.equals(str1)); // true
//        System.out.println(Objects.equals(str1, str2)); // true

        String str1 = new String("zxc");
        String str2 = new String("zxc");
        Student obj1 = new Student("zxc", 14);
        Student obj2 = new Student("zxc", 14);
        System.out.println(str1); // print a value
        System.out.println(obj1);
        System.out.println(obj1.equals(obj2)); // true
        System.out.println(obj1.getName().equals(obj2.getName())); // true
        System.out.println(Objects.equals(obj1, obj2)); // true
        System.out.println(Objects.equals(obj1.getName(), obj2.getName())); // true
    }
}

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
