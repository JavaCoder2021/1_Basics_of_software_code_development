//5.  Дано  натуральное  число  Т,  которое  представляет  длительность  прошедшего  времени  в  секундах.  Вывести 
//данное значение длительности в часах, минутах и секундах в следующей форме: 
//ННч ММмин SSc. 

package task_5;

public class Task_5 {
    
    public static void main(String[] args) {
        
        int Т = 4100;
        int sec = Т % 60;
        int min = (Т / 60) % 60;
        int hours = (Т / 60) / 60;

        System.out.printf("%d ч %d мин %d с \n", hours, min, sec);
       
    }
    
}
