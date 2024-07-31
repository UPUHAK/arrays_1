import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // task 1
        System.out.println("task 1");


        int[] intArray = new int[3];

        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }


        double[] doubleArray = {1.57, 7.654, 9.986};

        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println(doubleArray[i]);
        }


        String[] weekdayArray = {"пн", "вт", "ср", "чт", "пт", "сб", "вс"};

        System.out.println(Arrays.toString(weekdayArray));


        // task 2
        System.out.println("task 2");

        for (int i = 0; i < 3; i++) {
            if (i == intArray.length - 1) {
                System.out.println(intArray[i]);
            } else {
                System.out.print(intArray[i] + ", ");
            }
        }


        for (int i = 0; i < doubleArray.length; i++) {
            if (i == doubleArray.length - 1) {
                System.out.println(doubleArray[i]);
            } else {
                System.out.print(doubleArray[i] + ", ");
            }
        }


        for (int i = 0; i < weekdayArray.length; i++) {
            if (i == weekdayArray.length - 1) {
                System.out.println(weekdayArray[i]);
            } else {
                System.out.print(weekdayArray[i] + ", ");
            }
        }


        // task 3
        System.out.println("task 3");

        for (int i = intArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(intArray[i]);
            } else {
                System.out.print(intArray[i] + ", ");
            }
        }


        for (int i = doubleArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(doubleArray[i]);
            } else {
                System.out.print(doubleArray[i] + ", ");
            }
        }


        for (int i = weekdayArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(weekdayArray[i]);
            } else {
                System.out.print(weekdayArray[i] + ", ");
            }
        }


        // task 4
        System.out.println("task 4");

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0) {
                intArray[i] += 1;
            }
        }

        System.out.println(Arrays.toString(intArray));


    }
}