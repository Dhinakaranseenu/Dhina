package com.kb.collections_sorting;

import java.util.Enumeration;
import java.util.Vector;

public class vectos {
    public static void main(String[] args) {
        Vector v1 = new Vector();

        Vector v2 = new Vector(2);
        Vector v3 = new Vector(2,8);

        Vector<String> v = new Vector<String>(3);
        v.addElement("bike");
        System.out.println(v);
        v.addElement("car");
        System.out.println(v);
        v.addElement("cycle");
        System.out.println(v);
        v.addElement("bus");
        System.out.println(v);
        v.addElement("lorry");
        System.out.println(v);
        v.addElement("train");
        System.out.println(v);
        v.addElement("filgt");
        System.out.println(v);
        v.addElement("a");
        System.out.println(v);
        v.addElement("lorry");
        System.out.println(v);
        v.addElement("train");
        System.out.println(v);
        v.addElement("filgt");
        System.out.println(v);
        v.addElement("a");
        System.out.println(v);
        v.addElement("b");
        System.out.println(v);


        for(Object V5 : v){
            System.out.println(V5);
        }
        System.out.println(v.elements());
        System.out.println(v.size());
        System.out.println(v.capacity());
        Enumeration<String> e = v.elements();

        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
