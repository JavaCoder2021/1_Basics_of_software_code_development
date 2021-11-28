/*
 * Циклы. 8. 
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
 */
package by.epam.basics.сycles;

import java.util.Scanner;
import java.util.ArrayList;

public class Task8 {

    public static void main(String[] args) {
        
        int m = scannerInt("Enter the number m: ");
        int n = scannerInt("Enter the number n: ");
        
        String str1 = Integer.toString(m);
        String str2 = Integer.toString(n);
        
        ArrayList<Character> Chislo1 = new ArrayList();
        ArrayList<Character> Chislo2 = new ArrayList();
        ArrayList<Character> OdinakovieChisla = new ArrayList();
        
        for (int i = 0; i < str1.length(); i++)
            Chislo1.add(str1.charAt(i));
        for (int i = 0; i < str2.length(); i++)
            Chislo2.add(str2.charAt(i));
        
        for (int i = 0; i < Chislo1.size(); i++) {
           
            if (Chislo2.contains(Chislo1.get(i)) && !OdinakovieChisla.contains(Chislo1.get(i))) 
                OdinakovieChisla.add(Chislo1.get(i));               
           
        }
        
        System.out.println(OdinakovieChisla);
        
    }
    
    private static int scannerInt(String str) {
        
        Scanner input = new Scanner(System.in);
        int num = -1;
        
        do {
            System.out.print(str);
            if (input.hasNextInt()) {
                num = input.nextInt();
            } 
            else {
                input.next();
            }
        } while (num <= 0);

        return num;
        
    }
            
}
