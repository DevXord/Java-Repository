import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         **/
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wiek: ");
        int age = sc.nextInt();


        if(age % 3 == 0)
            System.out.println("Wiek jest podzielny przez 3");
        else
            System.out.println("Wiek nie jest podzielny przez 3");


        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu*/

        System.out.println("Podaj numer indeksu: ");
        int indexNumber = sc.nextInt();
        System.out.printf("Numer indeksu jest %s\n", (indexNumber % 2 == 0) ? "parzysty" : "nieparzysty");



        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        System.out.println("Podaj liczbę zmiennoprzecinkową: ");
        float fl = sc.nextFloat();

        if(fl < 0.50)
            System.out.printf("Liczba %f jest mniejsza od 0.50\n",fl);
        else if(fl == 0.50)
            System.out.printf("Liczba %f jest równa 0.50\n",fl);
        else if(fl > 0.50 && fl < 1.00)
            System.out.printf("Liczba %f jest wieksza od 0.50 ale mniejsza od 1.00\n",fl);
        else if(fl == 1.00)
            System.out.printf("Liczba %f jest równa 1.00\n",fl);
        else
            System.out.printf("Liczba %f jest wieksza od 1.00\n",fl);

    }

}
