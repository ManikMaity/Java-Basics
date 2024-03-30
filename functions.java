public class functions {
    public static void main(String[] args) {
        sayHello("Manik", 20); // Hello Manik
        sayHello("Suman", 16); // Hello Suman   
        int max = getMax(5, 6);
        System.out.println(max); // 6
        System.out.println(bigName("manik", "sanker")); //  sanker is bigger.
    }
    public static void sayHello(String name, int age){
        System.out.println("Hello " + name+"!, You are "+age+" years old.");
    }

    public static int getMax(int num1, int num2){
        if (num1 > num2){
            return num1;
        }
        else if (num2>num1){
            return num2;
        }
        else {
            return 0;
        }
       
    }

    // have to specify the return type of function 
    public static String bigName (String name1, String name2){
        if (name1.length() > name2.length()){
            return name1+" is bigger.";
        }
        else if (name2.length() > name1.length()){
            return name2+" is bigger.";
        }
        else{
            return "Both are same length.";
        }
    }
}
