public class operators {
    public static void main(String[] args) {
        //operators
        double a  = 1;
        double b = 2;
        int sum = (int)a + (int)b;
        int diff = (int)a -(int)b;
        int multify = (int)a*(int)b;
        double devide = a/b;
        System.out.println(devide); // 0.5
        System.out.println(5%3); //2

        // unary operator
        System.out.println(++a); // 2.0
        System.out.println(a--); // 2.0
        System.out.println(a); // 1.0
    }
}
