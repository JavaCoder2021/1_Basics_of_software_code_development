package task_5;

public class Task_5 {
    
    public static void main(String[] args) {
        
        int time = 3700;
        int sec = time % 60;
        int min = (time / 60) % 60;
        int hours = (time / 60) / 60;

        System.out.printf("%d ч %d мин %d с ", hours, min, sec);
       
    }
    
}