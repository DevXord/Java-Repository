import java.util.Scanner;

public class Main {



    /* ćw.2 */

    /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */

    /*
     *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
     *    mnożenia, dziealenia i modulo na zmiennych:
     *    a) liczba A i liczbaB, dowolne liczby calkowite (int),
     *    b) liczba X i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
     *  */


    public static void main(String[] args) {

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
        String str ="tested";
        int inter=1;
        short shorter = 1234;
        long longer = 1234567890;
        char cha = 'a';
        byte byt = 1;
        boolean bool = true;
        double dob = 3.5;
        float floa = 2;
        var stra = "str";
        var interva = 1;
        var doblvar = 1.2;
        var boolwar = true;

        System.out.println("String:" + str);
        System.out.printf("Int: %d, Short: %d, Long: %d, char: %s, byte: %d, boolen: %s \n",inter,shorter,longer,cha,byt,bool);
        System.out.printf("Double: %f, Float: %f, var str: %s, var int: %d, var double: %f, var boolen: %s\n\n",dob,floa,stra,interva,doblvar,boolwar);


        /*
         *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
         *    mnożenia, dziealenia i modulo na zmiennych:
         *
         *    a) liczba A i liczba B, dowolne liczby calkowite (int),
         *    b) liczba X i liczba Y, dowolne liczby zmiennoprzecinkowe (double)
         *  */


        //a
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int a = sc.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int b = sc.nextInt();

        System.out.println( ""+a +" + " +b+ " = " +(a + b));
        System.out.println( ""+a +" * " +b+ " = " +(a * b));
        System.out.println( ""+a +" / " +b+ " = " +(a / b));
        System.out.println( ""+a +" % " +b+ " = " +(a % b));

        //b

        System.out.println("Podaj pierwszą liczbę zmiennoprzecinkową: ");
        double x = sc.nextDouble();
        System.out.println("Podaj drugą liczbę zmiennoprzecinkową: ");
        double y = sc.nextDouble();

        System.out.println( ""+x +" + " +y+ " = " +(x + y));
        System.out.println( ""+x +" * " +y+ " = " +(x * y));
        System.out.println( ""+x +" / " +y+ " = " +(x / y));
        System.out.println( ""+x +" % " +y+ " = " +(x % y));


    }

}
