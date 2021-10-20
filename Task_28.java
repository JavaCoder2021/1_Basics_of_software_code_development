//Циклы. 8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
  
package task_28;

import java.util.Scanner;
import java.util.ArrayList;

public class Task_28 {

    public static void main(String[] args) {
        
        //Вводим 2 числа
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число m: ");
        int m = Math.abs(input.nextInt());
        System.out.print("Введите число n: ");
        int n = Math.abs(input.nextInt());
        
        //Преобразуем их в строку
        String str1 = Integer.toString(m);
        String str2 = Integer.toString(n);
        
        //Коллекции для хранения символов из чисел
        ArrayList<Character> Chislo1 = new ArrayList<>();
        ArrayList<Character> Chislo2 = new ArrayList<>();
        ArrayList<Character> OdinakovieChisla = new ArrayList<>();
        
        //Добавляем симолы в коллекции
        for (int i = 0; i < str1.length(); i++)
            Chislo1.add(str1.charAt(i));
        for (int i = 0; i < str2.length(); i++)
            Chislo2.add(str2.charAt(i));
        
        for (int i = 0; i < Chislo1.size(); i++)
        {
           
            if (Chislo2.contains(Chislo1.get(i)) && !OdinakovieChisla.contains(Chislo1.get(i))) 
                OdinakovieChisla.add(Chislo1.get(i));               
           
        }
        
        //Выводим полученные значения
        System.out.println(OdinakovieChisla);
        
    }
            
}