public class Zadanie2petla {
    public static void main(String[] args) {
        int numbers[] = {8, 5, 3, 2, 0, -1, -6, -8, 9, -10};
        //f

        for(int i=numbers.length-1 ;i>=0;i--){
            System.out.println(numbers[i]);
        }


        //b
        for (int element : numbers) {
            System.out.println(element);
        }
        //c
        int maximum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];

            }
        }
        System.out.println(maximum);

        int minimum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];

            }
        }
        System.out.println(minimum);

        //d
        int sum = 0;
        for (int element : numbers) {
            sum = sum + element;
        }

        double average = (double) sum / numbers.length;
        System.out.println("Average:");
        System.out.println(average);


        //e

        int numberMaxAverage = 0;
        for (int element : numbers) {
            if (element>average){
                numberMaxAverage= numberMaxAverage+1;
            }

        }
        System.out.println(numberMaxAverage);

        int numberMinAverage = 0;
        for (int element : numbers) {
            if (element<average){
                numberMinAverage=numberMinAverage+1;
            }

        }
        System.out.println(numberMinAverage);

        //f


    }
}
