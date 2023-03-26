import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String myHome;
        final int NUM=0;
        String word = "Hard";
        myHome=NUM+" "+word;
        System.out.println(myHome);
        if (NUM < 0){
            System.out.println("Вы ввели отрицательное число");
        } else if (NUM>0) {
            System.out.println("Вы ввели положительное число");
        }else {
            System.out.println("Вы ввели 0");
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name =sc.nextLine();
        System.out.println("Hello "+name +"!");
    }
}