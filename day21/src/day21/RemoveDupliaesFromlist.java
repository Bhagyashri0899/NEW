package day21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDupliaesFromlist {
	public static void main(String[] args) {
        Integer[] origArray = new Integer[] { 1, 2, 4, 9, 7, 3, 4, 5, 8, 6, 1, 7, 8 };

        // ArrayList with duplicate elements
        ArrayList<Integer> numbersList = new ArrayList<>();

        // remove duplicates
        List<Integer> listWithoutDuplicates = Arrays.asList(origArray)
            .stream()
            .distinct()
            .collect(Collectors.toList());

        System.out.println(listWithoutDuplicates);

        
    }
}
