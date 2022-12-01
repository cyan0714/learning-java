package PublicPrivate;

public class Person {
    private int age;

    public void setAge(int age) {
        if (age < 0 || age > 200) {
            System.out.println("设置的年龄不合法~");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }
}
