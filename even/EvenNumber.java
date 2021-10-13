package com.even;

public class EvenNumber {
    //Make it also record the total number of even numbers its has found and break once 5 are found
    //at the end display the total number of even numbers found
    public static void main(String[] args) {
        int numb = 0;
        int finishNumb = 10;
        int total = 0;
        int count = 0;

        while (numb <= finishNumb){
            numb++;
            if (!isEvenNumber(numb)){
                continue;
            }
            if(total >= 5){
                break;
            }
            System.out.println("Even number " + numb);
            total ++;
        }
        System.out.println("Total even numbers: " + total);
    }
    public static boolean isEvenNumber(int numb){
        if (numb % 2 == 0){
            return false;
        }else{
            return true;
        }
    }
}
