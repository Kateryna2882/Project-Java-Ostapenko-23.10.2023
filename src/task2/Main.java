package task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();
        int[] array1 = {1, 2, 3, 1};
        System.out.println("Array : " + Arrays.toString(array1));
        System.out.println("Contains Duplicate : " + solution.containsDuplicate(array1));
        int[] array2 = {1, 2, 3, 4};
        System.out.println("Array : " + Arrays.toString(array2));
        System.out.println("Contains Duplicate : " + solution.containsDuplicate(array2));
        int[] array3 = {1, 1, 1, 2, 3,3, 4, 3, 4 , 2};
        System.out.println("Array : " + Arrays.toString(array3));
        System.out.println("Contains Duplicate : " + solution.containsDuplicate(array3));
    }
}

