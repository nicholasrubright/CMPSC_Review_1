public class BubbleSort {

    void bubbleSort(int arr[]) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    +

    void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        int arr[] = {10, 3, 5, 22, 12};
        System.out.println("Unsorted arr");
        ob.printArray(arr);
        ob.bubbleSort(arr);
        System.out.println("Sorted arr");
        ob.printArray(arr);
    }

}
