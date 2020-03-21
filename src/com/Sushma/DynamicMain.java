package com.Sushma;

import java.util.ArrayList;

public class DynamicMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(0);
        var size =list.size();
        System.out.println(list);
        System.out.println(size);

    }

}
