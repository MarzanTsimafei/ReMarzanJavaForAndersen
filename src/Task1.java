import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String hi = "Привет";
        String first = "Введите число";


        Scanner scanner = new Scanner(System.in);
        System.out.println(first);
        int number = scanner.nextInt();
        if(number == 7){
            System.out.println(hi);
        }

    }
}

 //       Составить алгоритм: если введенное число больше 7, то вывести “Привет”


