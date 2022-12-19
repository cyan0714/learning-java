package insideClass;

public class People {
    private int heartbeat = 150;
    public class Heart {
        private int heartbeat = 110;
        public void show() {
            int heartbeat = 78;
            System.out.println(heartbeat);
            System.out.println(this.heartbeat);
            System.out.println(new People().heartbeat);
        }
    }

}

class Test {
    public static void main(String[] args) {
        People.Heart h = new People().new Heart();
        h.show();
    }
}
