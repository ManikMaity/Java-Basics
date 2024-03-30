
public class Arrays {
    public static void main(String[] args) {
        // to make a array first type name then [] then array name
        int[] marks = new int[3]; // 3 memory empty place
        boolean[] trueFalse = new boolean[5];
        marks[0] = 55;
        marks[1] = 66;
        marks[2] = 92;
        // System.out.println(marks); -- array will not print
        System.out.println(marks[0]); // 55
        System.out.println(marks.length);// 3 //() dont need

        // Array inisialize
        int[] age = { 21, 20, 19, 18 };

        // 2D arrays
        // two [][]
        int[][] allMarks = { { 55, 65, 78, 65 }, { 95, 95, 93, 35 } };

        System.out.println(allMarks[0][0]); // 55
        System.out.println(allMarks[1][0]); // 95

        int[] numbers = { 25, 56, 14, 63, 22 };
        printArray(numbers);

        String[] names = { "Manik", "Suman", "Swapan", "Malati" };
        reversePrintArray(names);

    }

    public static void reversePrintArray(String[] names) {
        System.out.println("Started printing names..");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
    }

    public static void printArray(int[] array) {

        // printing array
        // for (int num : array){
        // System.out.println(num);
        // }

        System.out.println("Started printing..");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
