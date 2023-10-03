import java.util.Scanner;

public class ArrayInputOutput {
    public static Scanner s = new Scanner(System.in);
    public static int[] input()
    {
        System.out.println("Enter the Size of Array: ");
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }
    public static int valueInput()
    {
        System.out.println("Enter value to Search: ");
        int valueToSearch = s.nextInt();
        return valueToSearch;
    }
    public static void arrayOutput(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Array Output: "+arr[i]);
        }
    }
}
