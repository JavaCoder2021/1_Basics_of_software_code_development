/*
 * Циклы. 6. 
 * Вывести на экран соответствий между символами 
 * и их численными обозначениями в памяти компьютера. 
 */
package by.epam.basics.сycles;

public class Task6 {

    public static void main(String[] args) {
        
        for(int i = 0; i <= 65536; i++)
            System.out.println(i + " --> " + (char) i);
        
    }
    
}
