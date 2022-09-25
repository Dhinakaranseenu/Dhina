package com.kb.collections_sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> o = new ArrayList<>();
        o.add("Apple");
        o.add("pinaple");
        o.add("orange");
        o.add("kiwi");
        System.out.println(o);

        for(Object i : o){
            System.out.println(i);
        }
        o.add(0,"graps");
        o.add(3,"tomoto");
        System.out.println(o);
        o.remove("pinaple");

        System.out.println(o);
        o.remove(3);
        System.out.println(o);

        Collections.sort(o);
        System.out.println(o);
    }
}
