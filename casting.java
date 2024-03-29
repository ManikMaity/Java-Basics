public class casting {
    public static void main(String[] args) {
        
        //casting
        // double take more memory then int. || so int can be strored in double -> called implisit casting
        
        double price = 100;
        double finalPrice = price + 18.0;
        System.out.println(finalPrice); // 118.0

        // but diuble value cant be stored in int -> called explisit casting
        // We can force cast but some value can be lost

        int price2 = 100;
        int fPrice = price2 + (int)18.0;
        System.out.println(fPrice); // 118
        int fPrice2 = price2 + (int)18.18;
        System.out.println(fPrice); // 118 -> .18 lost
        


    }
}
