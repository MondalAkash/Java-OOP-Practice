public class MainClass {
    public static void main(String[] args) {
//        LinearSearch l = new LinearSearch();
//        int status = l.linearSearch(ArrayInputOutput.input(), ArrayInputOutput.valueInput());
//        if(status <0)
//        {
//            System.out.println("Value not found");
//        }
        BubbleSorts b = new BubbleSorts();
        b.bubbleSort(ArrayInputOutput.input());
    }
}
