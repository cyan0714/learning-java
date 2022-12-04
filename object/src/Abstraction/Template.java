package Abstraction;

public class Template {
    public static void main(String[] args) {
        StudentChild sc = new StudentChild();
        sc.write();
    }
}

abstract class ArticleTemplate {
    public final void write() {
        System.out.println("开头");
        System.out.println(writeMain());
        System.out.println("结尾");
    }

    public abstract String writeMain();
}

class StudentChild extends ArticleTemplate {
    @Override
    public String writeMain() {
        return "我是小学生";
    }
}

class StudentMiddle extends ArticleTemplate {
    @Override
    public String writeMain() {
        return "我是中学生";
    }
}

