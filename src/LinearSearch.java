import interfaces.Search;

import java.util.Scanner;

public class LinearSearch implements Search {
    @Override
    public int search(int[] arr) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value to Search: ");
        int valueToSearch = s.nextInt();
        int counter = -1;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] == valueToSearch)
            {
                System.out.println("Value found at index: "+i);
                counter++;
            }
        }
        return counter;
    }
}
