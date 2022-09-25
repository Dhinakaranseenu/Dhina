package com.kb.collections_sorting;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Objects;

public class linkedinList {
    public static void main(String[] args) {
        LinkedList<String > l = new LinkedList<String>();
        l.add("one");
        l.add("two");
        l.add("three");
        l.add("four");
        System.out.println(l);
        for(Object o1 : l) {
            System.out.println(o1);
        }

            l.addFirst("ten");
            System.out.println(l);

            l.addLast("nine");
            System.out.println(l);

            l.add(3,"six");
            System.out.println(l);

            Object o2 = l.get(3);
        System.out.println(l);

        l.set(3,"seven");
        System.out.println(l);

        l.removeFirst();
        System.out.println(l);

        l.removeLast();
        System.out.println(l);

        l.remove(2);
        System.out.println(l);
        
        }
    }

