    package com.Sushma;

    public class practiceMain{

        public static void main(String[] args) {

          practice numbers= new practice(3);
           var numbersArray = new int[10];

            numbers.insert(10);
            numbers.insert(20);
            numbers.insert(30);
            numbers.insert(40);
            numbers.removeAt(3);
            System.out.println(numbers.indexOf(10));
            numbers.print();

        }
    }

