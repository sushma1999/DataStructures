package com.Sushma;

public class HashMain {
    public static void main(String[] args){
        HashTable table = new HashTable();
        table.put(6, "A");
        table.put(8,"B");
        table.put(11,"C");
      //  System.out.println("Done");
        table.remove(6);
        System.out.println(table.get(6));

    }
}
