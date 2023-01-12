public class BubbleSort {
    private static void sort(int arr[]) {
        int temp = 0;
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (arr[j+1] < arr[j]) {
                    // swap
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // int nArray[] = new int[] {2, 5, 3, 4, 1};
        // int nArray[] = {2, 5, 3, 4, 1};
        int nArray[] = {5, 4, 3, 2, 1};

        // Print unsorted
        System.out.println("Original array: ");
        for (int i = 0; i < nArray.length; i++) {
            System.out.print(nArray[i] + " ");
        }

        sort(nArray);

        // Print sorted
        System.out.println("\nSorted array: ");
        for (int i = 0; i < nArray.length; i++) {
            System.out.print(nArray[i] + " ");
        }
    }
}