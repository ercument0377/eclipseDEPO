public class Sozluk{

    public static void main(String[] args) {
        int[] dizi = { 4, 5, 21, 22, 11, 30, 441, 56, 7, 89, 95, 51, 32, 111, 34, 5, 7, 9, 0, 112, 252, 142, 185, 211,
                34, 6, 18, 99, 71 };

        InsertionSort insertionSort = (arr, n) -> {
            int i, key, j;
            for (i = 1; i < n; i++) {
                key = arr[i];
                j = i - 1;

                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        };
        BubbleSort bubbleSort = (arr) -> {
            int n = arr.length;
            int temp = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < (n - i); j++) {
                    if (arr[j - 1] > arr[j]) {
                        // swap elements
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }

                }
            }
        };

        sirayaKoyInsertion(dizi, insertionSort);
        sirayaKoyBubble(dizi, bubbleSort);
        System.out.println("72 sayisinin indexi: " + binarySearch(dizi, 0, dizi.length - 1, 72));

    }

    public static void sirayaKoyInsertion(int[] dizi, InsertionSort insertionSort) {
        insertionSort.insertionSort(dizi, dizi.length);

    }

    public static void sirayaKoyBubble(int[] dizi, BubbleSort bubbleSort) {
        bubbleSort.bubbleSort(dizi);
    }

    // Method 1
    // Recursive binary search
    // Returns index of x if it is present
    // in arr[l..r], else return -1
    static int binarySearch(int arr[], int l, int r, int x) {
        // Restrict the boundary of right index
        // and the left index to prevent
        // overflow of indices
        if (r >= l && l <= arr.length - 1) {

            int mid = l + (r - l) / 2;

            // If the element is present
            // at the middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then it can
            // only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present in
        // array
        return -1;
    }
}

@FunctionalInterface
interface InsertionSort {

    void insertionSort(int[] dizi, int n);
}

@FunctionalInterface
interface BubbleSort {

    void bubbleSort(int[] dizi);
}
