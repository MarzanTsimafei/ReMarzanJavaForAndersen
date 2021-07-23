import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String hi = "Привет";
        String checkName = "Вячеслав";
        String second = "Введите имя";
        String missingName = "Нет такого имени";


        Scanner scanner = new Scanner(System.in);
        System.out.println(second);

        String name = scanner.nextLine();
        if(name.equals(checkName)){
            System.out.println(hi + " " + checkName);
        } else System.out.println(missingName);

    }
}
//      Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"