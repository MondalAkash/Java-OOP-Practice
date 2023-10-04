import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1. Linear Search");
        System.out.println("2. Bubble Sort");
        System.out.println("3. Binary Search");
        System.out.println("4. Prime Number");
        System.out.println("5. Fibonacci Series");
        System.out.println("Pls Select your choice: ");
        int choice = s.nextInt();
        if(choice == 1)
        {
            System.out.println("Enter the Size of Array: ");
            int size = s.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = s.nextInt();
                //arr[i] = i;
            }
            LinearSearch l = new LinearSearch();
            int status = l.search(arr);
            if(status <0)
            {
                System.out.println("Value not found");
            }
        }
        else if(choice == 2)
        {
            System.out.println("Enter the Size of Array: ");
            int size = s.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = s.nextInt();
                //arr[i] = i;
            }
            BubbleSorts b = new BubbleSorts();
            b.bubbleSort(arr);
        }
        else if(choice == 3)
        {
            System.out.println("Enter the Size of Array: ");
            int size = s.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = s.nextInt();
                //arr[i] = i;
            }
            BubbleSorts bu = new BubbleSorts();
            bu.bubbleSort(arr);
            BinarySearch b = new BinarySearch();
            int status = b.search(arr);
            if(status <0)
            {
                System.out.println("Value not found");
            }
        }
        else if (choice == 4) {
            PrimeNumber p = new PrimeNumber();
            System.out.print("Enter a value: ");
            boolean status = p.primeNumber(s.nextInt());
            if(status == true)
            {
                System.out.println("Prime Number");
            }
            else
            {
                System.out.println("Not Prime Number");
            }
        }


    }
}
