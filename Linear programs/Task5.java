//5.  Дано  натуральное  число  Т,  которое  представляет  длительность  прошедшего  времени  в  секундах.  Вывести 
//данное значение длительности в часах, минутах и секундах в следующей форме: 
//ННч ММмин SSc. 

package task5;

public class Task5 {
    
    public static void main(String[] args) {
        
        int Т = 4085;
        int sec = Т % 60;
        int min = (Т / 60) % 60;
        int hours = (Т / 60) / 60;

        System.out.printf("%02dч %02dмин %02dс \n", hours, min, sec);
       
    }
    
}
