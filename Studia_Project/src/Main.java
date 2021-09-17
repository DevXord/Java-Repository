import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj tekst: ");
        String name = sc.nextLine();
        System.out.println("Podaj liczbę: ");
        int number = sc.nextInt();
        System.out.println("Tekst: " + name + ", " + "Liczba: " + number);
        System.out.printf("Tekst: %s, Liczba: %d",name,number);

    }

}
