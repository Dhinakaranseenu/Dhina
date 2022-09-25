package com.kb.collections_sorting;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class sets {
    public static void main(String[] args) {
        Set s = new LinkedHashSet();
        s.add("A");
        System.out.println(s);
        s.add("B");
        System.out.println(s);
        s.add("C");
        System.out.println(s);
        s.add("D");
        System.out.println(s);
        s.add("A");
        System.out.println(s);

        Set s1 = new LinkedHashSet();
        s1.addAll(s);

        s.clear();
        System.out.println(s);

        s.add("E");
        System.out.println(s);
        s.add("F");
        System.out.println(s);
        s.add("G");
        System.out.println(s);
        s.add("H");
        System.out.println(s);

        Iterator i = s.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println(s.contains("A"));
        System.out.println(s.contains("F"));

        s.remove("F");
        System.out.println(s);
        s.remove("G");
        System.out.println(s);
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.removeAll(s);
        System.out.println(s);
    }
}
