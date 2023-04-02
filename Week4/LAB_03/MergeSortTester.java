import java.util.Arrays;
public class MergeSortTester {
    public static void main(String[] args) {
        int [] arr1= {1,2,4,7,8,11};
        int [] arr2= {3,6,8,9,10,11,12,14};

        //invoke the merge() method, get a return value.
        int[] mergedArr = Sorter.merge(arr1, arr2);

        //Print out the returning array.
        System.out.print("New Array: ");
        System.out.println(Arrays.toString(mergedArr));

        //invoke the getMax() method with sorted array, Print out the returning integer value.
        System.out.print("Max value is: ");
        System.out.println(Sorter.getMax(mergedArr));

        //invoke the getMin() method with sorted array, Print out the returning integer value.
        System.out.print("Min value is: ");
        System.out.println(Sorter.getMin(mergedArr));



    }
}
