import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

        int x = 5,y = 0,z = 0;
        Random rand = new Random();

        x += 5;
        System.out.println("x + 5 = "+ x);
        x -= 2;
        System.out.println("x - 2 = "+ x);
        x /= 2;
        System.out.println("x / 2 = "+ x);
        x %= 2;
        System.out.println("x % 2 = "+ x);
        System.out.println("//////////////////////////////////////////");


        x = 2;
        y = x++;
        System.out.println("y = "+y);
        x = 2;
        y = ++x;
        System.out.println("y = "+y);
        System.out.println("//////////////////////////////////////////");



        x = rand.nextInt(3);

        System.out.println("Random x = " + (x));
        System.out.println("x == 2 = " + (x == 2));
        System.out.println("x != 2 = " + (x != 2));
        System.out.println("x >= 2 = " + (x >= 2));
        System.out.println("x <= 2 = " + (x <= 2));
        System.out.println("x < 2 = " + (x < 2));
        System.out.println("x > 2 = " + (x > 2));
        System.out.println("//////////////////////////////////////////");
        x = rand.nextInt(5);
        y = rand.nextInt(4);
        z = rand.nextInt(2);
        System.out.printf("Random x = %d  Random y = %d  Random z = %d\n",x,y,z);
        System.out.println("x == y || y >= z  = " + (x == y || y >= z));
        System.out.println("x <= z || y >= z  = " + (x <= z || y >= z));
        System.out.println("x != z || y != z  = " + (x != z || y != z));
        System.out.println("x != z || y == z  = " + (x != z || y == z));
        System.out.println("x != z || y == z  && x != z = " + (x != z || y == z && x != z));
        System.out.println("x != z || y == z  && x == z = " + (x != z || y == z && x == z));
        System.out.println("x != z || y == z  && x <= z = " + (x != z || y == z && x <= z));
        System.out.println("x != z || y == z  && x >= z = " + (x != z || y == z && x >= z));
        System.out.println("x != z || y == z  && x >= z && y == z = " + (x != z || y == z && x >= z && y == z));
        System.out.println("x != z || y == z  && x >= z && y != z = " + (x != z || y == z && x >= z && y != z));
        System.out.println("x != z || y == z  && x != z && y != z = " + (x != z || y == z && x != z && y != z));
        System.out.println("(x != z || y == z)  && x >= z && y == z = " + ((x != z || y == z) && x >= z && y == z));
        System.out.println("(x != z || y == z)  && x >= z && y != z = " + ((x != z || y == z) && x >= z && y != z));
        System.out.println("(x != z || y == z)  && x != z && y != z = " + ((x != z || y == z) && x != z && y != z));


    }

}
