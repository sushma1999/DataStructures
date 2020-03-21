package com.Sushma;

public class CharMain {
    public static void main(String[] args){
        CharFinder finder=new CharFinder();
       var ch= finder.findFirstNonRepeatingChar("a green apple");
       var sh= finder.findFirstRepeatedChar("a green apple");
       System.out.println(ch);
       System.out.println(sh);

    }
}
