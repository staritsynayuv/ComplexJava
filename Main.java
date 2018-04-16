import java.util.Scanner;

public class Main {



    static Scanner in = new Scanner(System.in);

    public static Complex enterComplex(){

        return new Complex(in.nextDouble(), in.nextDouble());


    }

    public static void main(String[] args){

        while (true) {

            System.out.println("Введите команду");
            String command = in.next();

            if (command.equals("exit")) {
                break;
            }

            System.out.println("Введите действительную и мнимую часть");
            Complex complex1 = enterComplex();
            Complex complex2 = enterComplex();

            System.out.println("c1=" + complex1.toString());
            System.out.println("c2=" + complex2.toString());


            if (command.equals("add")) {

                Complex res = complex1.add(complex2);
                System.out.println("Ответ: " + res.toString());
            }

            if (command.equals("dif")) {

                Complex res = complex1.subtract(complex2);
                System.out.println("Ответ: " + res.toString());
            }

            if (command.equals("mult")) {

                Complex res = complex1.multiply(complex2);
                System.out.println("Ответ: " + res.toString());
            }




        }

    }

}
