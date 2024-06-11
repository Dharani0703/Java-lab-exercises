package arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class RemoveDup
{
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 3, 2, 1};

        int[] uniqueNumbers = removeDuplicates(numbers);

        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueNumbers));
    }

    public static int[] removeDuplicates(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }

        return result;
    }
}
