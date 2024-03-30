public class classes {
    public static void main(String[] args) {
        Laptop asus = new Laptop("Ausu Vivibook", "Silver", 4, 256);
        asus.Boot();
        Laptop apple = new Laptop("Macbook pro", "Black", 12, 1000);
        apple.shutDown();
    }
}
