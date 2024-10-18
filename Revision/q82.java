public class q82 {
    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[low];//2,1,5,4,3,6
        int i = low + 1;
        int j = high;
        int temp;
        while (i <= j) {
            while (arr[i] < pivot && i <= j) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else
                break;
        }
        temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    public static void main(String args[]) {
        int a[] = { 2, 1, 5, 4, 3, 6 };
        int low = 0;
        int high = a.length - 1;
        quickSort(a, low, high);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
