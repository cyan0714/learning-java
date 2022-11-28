package Car;

public class Car {
    public String name;
    public double price;
    public void start() {
        System.out.println("启动了");
    };
    public void run() {
        System.out.println("车名："+ name + "价格："+ price);
    }
}
