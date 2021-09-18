import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
         *   a) Imię, nazwisko, wiek, nr indeksu,
         *   dane mają być wprowadzane z klawiatury w konsoli
         *   b) wyświetlić dane za pomocą println i printf
         */
        //a
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj swoje imie: ");
        String name = sc.nextLine();
        System.out.println("Podaj swoje nazwisko: ");
        String surName = sc.nextLine();
        System.out.println("Podaj swój wiek: ");
        int age = sc.nextInt();
        System.out.println("Podaj swój numer indeksu: ");
        int indexNumber = sc.nextInt();
        //b
        System.out.println("Imie: "+name+", Nazwisko: "+surName+", Wiek: "+age+", Numer indeksu: " +indexNumber);
        System.out.printf("Imie: %s, Nazwisko: %s, Wiek: %d, Numer indeksu: %d",name,surName,age,indexNumber);



        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
         *   wynik wyświetlić w konsoli programu
         */
        int x = 10,y = 5;
        System.out.println("Dodawanie: " +(x + y));
        System.out.println("Odejmowanie: "+(x - y));
        System.out.println("Mnożenie: "+(x * y));
        System.out.println("Dzielenie: " +(x / y));
        System.out.println("Reszta z dzielenia: "+(x % y));



    }

}
