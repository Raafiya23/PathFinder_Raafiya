public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int length = arr.length;
        int[] temp = new int[length];
        int j = 0;
        for (int i = 0; i < length - 1; i++) {
            if (arr[i] != arr[i + 1]) { 
                temp[j++] = arr[i];     
            }
        }
        temp[j++] = arr[length - 1]; 
        System.out.print("After removing duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
