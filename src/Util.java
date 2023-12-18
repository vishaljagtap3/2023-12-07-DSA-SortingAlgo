public class Util {

    public static int bubbleSort(int [] arr) {
        int passes = arr.length - 1;
        int comps = arr.length - 1;

        for(int i = 0; i < passes; i++) {
            int count = 0;
            for(int j = 0; j < (comps - i); j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }
            if(count == 0) {
                return i + 1;
            }
        }
        return arr.length-1;
    }

    public static void selectionSort(int [] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            int min = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int [] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0;  j < i; j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void quickSort(int [] arr, int left, int right) {
        if(left >= right) {
            return;
        }

        int pivotLocation = partition(arr, left, right);
        quickSort(arr, left, pivotLocation-1);
        quickSort(arr, pivotLocation+1, right);
    }

    private static int partition(int [] arr, int left, int right) {
        int pivot = arr[left];

        while(left != right) {

            while(arr[right] > pivot && left != right) {
                right--;
            }
            if(left == right) {
                break;
            }
            arr[left] = arr[right];

            while(arr[left] < pivot && left != right) {
                left++;
            }
            if(left == right) {
                break;
            }
            arr[right] = arr[left];
        }

        //we have got the pivot location
        arr[left] = pivot;
        return right;
    }
}
