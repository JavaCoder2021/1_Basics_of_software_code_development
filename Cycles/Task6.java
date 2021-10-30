//Циклы. 6. Вывести на экран соответствий между символами 
//и их численными обозначениями в памяти компьютера. 

package task6;

public class Task6 {

    public static void main(String[] args) {
        
        for (int i = 0; i <= 65535; i++)
            System.out.println(i + " --> " + (char) i);
    }
    
}
