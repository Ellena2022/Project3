import java.util.Scanner;
public class main {
    public static void main (String [] args){
        Scanner smail = new Scanner(System.in);
        System.out.println("Угадайте числа");
        System.out.println("Введите первое число от 0 до 10");
        int a = smail.nextInt();
        int b= 10;
if (a > b) System.out.println("Попробуйте еще");
else if (b>a) System.out.println("Всё верно");
else  System.out.println("У вас всё получится.Попробуйте снова");
    }
}
