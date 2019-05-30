// print numbers from 10 to 20

package com.cyclePackage;

public class Cycle {
    public static void main(String[] args) {
        int low = 10;
        int up = 20;
        int[] arr = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int counter; // 0 by default

        // while
        System.out.print("\nwhile: ");
        counter = low;
        while(counter <= up){
            System.out.print(counter + " ");
            counter ++;
        }

        // do..while
        counter = low;
        System.out.print("\ndo..while: ");
        do{
            System.out.print(counter + " ");
            counter++;
        }while (counter <= up);

        // for
        System.out.print("\nfor: ");
        for (counter = low; counter <= up; counter ++){
            System.out.print(counter + " ");
        }

        // for/in
        System.out.print("\nfor/in: ");
        for(int i: arr){
            System.out.print(i + " ");
        }
    }

}
