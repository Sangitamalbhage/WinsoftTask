import java.util.Arrays;

 class MergeArrays {

    public static void main(String[] args) {
        int[] array1 = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] array2 = {1, 8, 9, 10, 15};

        
        int countNonZero1 = 0;
        for (int num : array1) {
            if (num != 0) {
                countNonZero1++;
            }
        }

        
        int countNonZero2 = 0;
        for (int num : array2) {
            if (num != 0) {
                countNonZero2++;
            }
        }

       
        int[] mergedArray = new int[countNonZero1 + countNonZero2];

       
        int index = 0;
        for (int num : array1) {
            if (num != 0) {
                mergedArray[index++] = num;
            }
        }
        for (int num : array2) {
            if (num != 0) {
                mergedArray[index++] = num;
            }
        }

       
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
}