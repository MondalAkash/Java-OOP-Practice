import interfaces.Search;

public class LinearSearch implements Search {
    @Override
    public int linearSearch(int[] arr, int valueToSearch) {
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
