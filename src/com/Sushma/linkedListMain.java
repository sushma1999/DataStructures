package com.Sushma;
import java.util.Arrays;
//import java.util.LinkedList;
public class linkedListMain{
    public static void main(String[] args){
        //    java.util.LinkedList<String> x = new java.util.LinkedList<>();
          //   x.removeFirst();
            var list =new LinkedList();
      list.addLast(10);
       list.addLast(20);
    //   list.addFirst(40);
        list.addLast(30);
        list.removeFirst();
  //       list.reverse();
       //  var array =list.toArray();
        list.removeLast();
        //System.out.println(list.indexOf(20));
        System.out.println(list.contains(10));
//System.out.println(Arrays.toString(array));
    }

}

