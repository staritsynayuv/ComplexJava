import java.awt.*;
import java.util.Scanner;

public class Main {
    public  static Complex complex1;
    public static Complex complex2;

    static Scanner in = new Scanner(System.in);

    public static void enterComplex(){

        complex1 = new Complex(in.nextDouble(), in.nextDouble());
        complex2 = new Complex(in.nextDouble(), in.nextDouble());
        System.out.println("c1=" + complex1.toString());
        System.out.println("c2=" + complex2.toString());

    }

    public static void main(String[] args){
        System.out.println("Введите действительную и мнимую часть");
        enterComplex();
        while (true) {
            System.out.println("Введите команду");
            String command = in.next();

            if (command.equals("add")) {
                Complex res = complex1.Addition(complex2);
                System.out.println("Ответ: " + res.toString());
            }

            if (command.equals("dif")) {
                Complex res = complex1.Dif(complex2);
                System.out.println("Ответ: " + res.toString());
            }

            if (command.equals("mult")) {
                Complex res = complex1.Mult(complex2);
                System.out.println("Ответ: " + res.toString());
            }
        }

    }

}
