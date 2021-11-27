import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Zadanie2 {
    public static void main(String[] args) {

        //b
        int numbers[] = {8, 5, 3, 2, 0, -1, -6, -8, 9, -10};
        System.out.println("Elementy tablicy:");
        System.out.print(numbers[0] + ", ");
        System.out.print(numbers[1] + ", ");
        System.out.print(numbers[2] + ", ");
        System.out.print(numbers[3] + ", ");
        System.out.print(numbers[4] + ", ");
        System.out.print(numbers[5] + ", ");
        System.out.print(numbers[6] + ", ");
        System.out.print(numbers[7] + ", ");
        System.out.print(numbers[8] + ", ");
        System.out.println(numbers[9]);

        //c
        int maxNumber = numbers[0];
        if (numbers[1] > maxNumber) {
            maxNumber = numbers[1];
        }
        if (numbers[2] > maxNumber) {
            maxNumber = numbers[2];
        }
        if (numbers[3] > maxNumber) {
            maxNumber = numbers[3];
        }
        if (numbers[4] > maxNumber) {
            maxNumber = numbers[4];
        }
        if (numbers[5] > maxNumber) {
            maxNumber = numbers[5];
        }
        if (numbers[6] > maxNumber) {
            maxNumber = numbers[6];
        }
        if (numbers[7] > maxNumber) {
            maxNumber = numbers[7];
        }
        if (numbers[8] > maxNumber) {
            maxNumber = numbers[8];
        }
        if (numbers[9] > maxNumber) {
            maxNumber = numbers[9];
        }

        System.out.println("Max:");
        System.out.println(maxNumber);

        int minNumber = numbers[0];

        if (numbers[1] < minNumber) {
            minNumber = numbers[1];
        }
        if (numbers[2] < minNumber) {
            minNumber = numbers[2];
        }
        if (numbers[3] < minNumber) {
            minNumber = numbers[3];
        }
        if (numbers[4] < minNumber) {
            minNumber = numbers[4];
        }
        if (numbers[5] < minNumber) {
            minNumber = numbers[5];
        }
        if (numbers[6] < minNumber) {
            minNumber = numbers[6];
        }
        if (numbers[7] < minNumber) {
            minNumber = numbers[7];
        }
        if (numbers[8] < minNumber) {
            minNumber = numbers[8];
        }
        if (numbers[9] < minNumber) {
            minNumber = numbers[9];
        }

        System.out.println("Minimum:");
        System.out.println(minNumber);

        //d

        int sum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4] + numbers[5] + numbers[6] + numbers[7] + numbers[8] + numbers[9];
        double average = (double) sum / numbers.length;
        System.out.println("Srednia:");
        System.out.println(average);

        int iloscLiczbWiekszycOdSredniej = 0;
        if (numbers[0] > average) {
            iloscLiczbWiekszycOdSredniej = 1;
        }
        if (numbers[1] > average) {
            iloscLiczbWiekszycOdSredniej=iloscLiczbWiekszycOdSredniej +1;
        }
        if (numbers[2] > average) {
            iloscLiczbWiekszycOdSredniej=iloscLiczbWiekszycOdSredniej +1;
        }
        if (numbers[3] > average) {
            iloscLiczbWiekszycOdSredniej=iloscLiczbWiekszycOdSredniej +1;
        }
        if (numbers[4] > average) {
            iloscLiczbWiekszycOdSredniej=iloscLiczbWiekszycOdSredniej +1;
        }
        if (numbers[5] > average) {
            iloscLiczbWiekszycOdSredniej=iloscLiczbWiekszycOdSredniej +1;
        }
        if (numbers[6] > average) {
            iloscLiczbWiekszycOdSredniej=iloscLiczbWiekszycOdSredniej +1;
        }
        if (numbers[7] > average) {
            iloscLiczbWiekszycOdSredniej=iloscLiczbWiekszycOdSredniej +1;
        }
        if (numbers[8] > average) {
            iloscLiczbWiekszycOdSredniej=iloscLiczbWiekszycOdSredniej +1;
        }
        if (numbers[9] > average) {
            iloscLiczbWiekszycOdSredniej=iloscLiczbWiekszycOdSredniej +1;
        }

        System.out.println("Ilość liczb większych od średniej:");
        System.out.println(iloscLiczbWiekszycOdSredniej);

        int iloscLiczbMniejszychOdSredniej = 0;
        if (numbers[0] < average) {
            iloscLiczbMniejszychOdSredniej = 1;
        }
        if (numbers[1] < average) {
            iloscLiczbMniejszychOdSredniej=iloscLiczbMniejszychOdSredniej +1;
        }
        if (numbers[2] < average) {
            iloscLiczbMniejszychOdSredniej=iloscLiczbMniejszychOdSredniej +1;
        }
        if (numbers[3] < average) {
            iloscLiczbMniejszychOdSredniej=iloscLiczbMniejszychOdSredniej +1;
        }
        if (numbers[4] < average) {
            iloscLiczbMniejszychOdSredniej=iloscLiczbMniejszychOdSredniej +1;
        }
        if (numbers[5] < average) {
            iloscLiczbMniejszychOdSredniej=iloscLiczbMniejszychOdSredniej +1;
        }
        if (numbers[6] < average) {
            iloscLiczbMniejszychOdSredniej=iloscLiczbMniejszychOdSredniej +1;
        }
        if (numbers[7] < average) {
            iloscLiczbMniejszychOdSredniej=iloscLiczbMniejszychOdSredniej +1;
        }
        if (numbers[8] < average) {
            iloscLiczbMniejszychOdSredniej=iloscLiczbMniejszychOdSredniej +1;
        }
        if (numbers[9] < average) {
            iloscLiczbMniejszychOdSredniej=iloscLiczbMniejszychOdSredniej +1;
        }

        System.out.println("Ilość liczb mniejzych od średniej:");
        System.out.println(iloscLiczbMniejszychOdSredniej);

        //f


        System.out.println("Elementy tablicy:");
        System.out.print(numbers[9] + ", ");
        System.out.print(numbers[8] + ", ");
        System.out.print(numbers[7] + ", ");
        System.out.print(numbers[6] + ", ");
        System.out.print(numbers[5] + ", ");
        System.out.print(numbers[4] + ", ");
        System.out.print(numbers[3] + ", ");
        System.out.print(numbers[2] + ", ");
        System.out.print(numbers[1] + ", ");
        System.out.println(numbers[0]);



    }
    }


