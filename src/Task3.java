import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        String enter = "Введите размер массива ";
        String elements = "Введите элементы массива ";
        String numbers = "Числа кратные 3 = ";

        Scanner input = new Scanner(System.in);
        System.out.println(enter);
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println(elements);



        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        System.out.print (numbers);
        for (int i = 0; i < size; i++) {

            if (array[i]%3 == 0){
                System.out.print(" " + array[i] + " ");
            }

        }

    }
}
//      Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3