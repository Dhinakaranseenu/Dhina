package com.kb.collections_sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrimitiveSorting {

    public static void main(String[] args) {

        int[] arrayOfIntegers = {3,1,0,7};

        Arrays.sort(arrayOfIntegers);

        System.out.println("sorted array of integers are ");
        System.out.println(Arrays.toString(arrayOfIntegers));

        String[] arrayOfStrings = {"hai","how","are","you"};
        System.out.println("sorted array of strings are ");
        Arrays.sort(arrayOfStrings);
        System.out.println(Arrays.toString(arrayOfStrings));

        List stringList = new ArrayList();
        stringList.add("java");
        stringList.add("unix");
        stringList.add("shell script");
        stringList.add("j2ee");

        Collections.sort(stringList);
        System.out.println("sorted list of integers are ");
        for (Object element : stringList) {
            System.out.println(element);
        }
    }
}
