public class Main {
    public static void main(String[] args) {
        int [] arr = {34, 90, 85, 12, 78, 45, 66, 23, 29, 73, 49, 55};

        /*int passes = Util.bubbleSort(arr);
        System.out.println("Passes: " + passes);*/
        //Util.selectionSort(arr);
        //Util.insertionSort(arr);
        Util.quickSort(arr, 0, arr.length-1);

        for(int val : arr) {
            System.out.print(val + " " );
        }
        System.out.println();
    }
}
