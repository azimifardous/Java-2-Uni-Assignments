public class Sorter {
    public static int[] merge(int[] arr_01, int[] arr_02) {
        int[] mergedArr = new int[arr_01.length + arr_02.length];

        int i = 0, j = 0, k = 0;
        while (i < arr_01.length && j < arr_02.length) {
            if (arr_01[i] < arr_02[j]) {
                mergedArr[k++] = arr_01[i++];
            } else {
                mergedArr[k++] = arr_02[j++];
            }
        }

        // Sorting the rest
        while (i < arr_01.length) {
            mergedArr[k++] = arr_01[i++];
        }

        while (j < arr_02.length) {
            mergedArr[k++] = arr_02[j++];
        }

        return mergedArr;
    }

    public static int getMax(int[] sortedArr) {
        int maxNum = sortedArr[0];

        for (int num : sortedArr) {
            if ( num > maxNum)
                maxNum = num;
        }
        return maxNum;
    }

    public static int getMin(int[] sortedArr) {
        int minNum = sortedArr[0];

        for (int num : sortedArr) {
            if (num < minNum)
                minNum = num;
        }
        return minNum;
    }
}
