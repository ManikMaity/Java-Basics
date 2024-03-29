public class DataType {
    public static void main(String[] args) {

        // types in java - Primitive, Refrense
        // Byte - 1byte memory[-125 to 127]
        // Short - 2
        // int - 4
        // long - 8
        // float - 4
        // double - 8
        // char - 2
        // bool - 1


        // Primitive Type Values
        byte age = 30;
        int phone = 1230253320;
        long phone2 = 7076404237L; // L in last for long value 
        float PI = 3.14F; //  F in last for flaot value
        char letter = '@';
        boolean isAdult = true;

        // Non-premitive type value
        // Non-premetive type of value have methods like js
        // "new" keyword should be used when defining non-primitive datatype but it is not compalsary
        String name = new String("Manik");
        String friend = new String("Ronit");
        System.out.println(name.length());


    }
}
