import interfaces.BubbleSort;

public class BubbleSorts implements BubbleSort {
    public int[] swap(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        return arr;
    }

    @Override
    public int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[j]<arr[j-1])
                {
                    swap(arr, j, j-1);
                }
            }
        }
        System.out.println("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        return arr;
    }


}
