import interfaces.Search;

import java.util.Scanner;

public class BinarySearch implements Search {
    @Override
    public int search(int[] arr) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter value to Search: ");
        int valueToSearch = s.nextInt();
        int counter = -1;
        int left, right, mid;
        left = 0;
        right = arr.length-1;
        while(left<=right)
        {
            mid = (left+right)/2;
            if(arr[mid] == valueToSearch)
            {
                System.out.println("Value found at index: "+mid);
                counter++;
            }
            if(valueToSearch<arr[mid])
            {
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
        }
        return counter;
    }
}
