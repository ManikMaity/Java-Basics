public class Strings {
    public static void main(String[] args) {

        // Concatination
        String name1  = "Manik";
        String name2 = "Swapan";
        String surname1 = "Maity";
        String fullName = name1 +" "+ surname1; // Manik Maity
        System.out.println(fullName);
        System.out.println(name1.concat(name2)); // ManikSwapan

        //charAt and length
        char lastChar = name1.charAt(name1.length() - 1);
        System.out.println(lastChar); // k

        //replace, replace all occurance
        // In java string is inmutable
        String animal = "RatR";
        String playObj = animal.replace('R', 'B');
        System.out.println(playObj); // BatB
        System.out.println(animal); // RatR

        //Substring - last index isnt included
        String placeName = "Kolkata";
        System.out.println(placeName.substring(0, 3)); // Kol
    }
}
