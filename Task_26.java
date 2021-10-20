//Циклы. 6. Вывести на экран соответствий между символами 
//и их численными обозначениями в памяти компьютера. 

package task_26;

public class Task_26 {

    public static void main(String[] args) {
        
        for (int i = 0; i <= 65535; i++)
            System.out.println(i + " --> " + (char) i);
    }
    
}