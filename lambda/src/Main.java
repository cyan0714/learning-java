public class Main {
    public static void main(String[] args) {
//        goSwimming(new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("去游泳~");
//            }
//        });
        goSwimming(() -> System.out.println("try lambda"));
    }

    public static void goSwimming(Swimming swimming) {
        swimming.swim();
    }
}

@FunctionalInterface
interface Swimming {
    void swim();
}