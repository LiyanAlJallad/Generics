package Q_LE2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import Q1L1.TestingExecutionTime;

public class GenericsAndArrays_Liyan {
    public static void main(String[] args) {
        TestingExecutionTime.myHeader(2,1,"Application on Arraylist");

        Scanner input = new Scanner(System.in);

        int num = 0;
        boolean exep = true;
        char cont = 'y';
        int students = 0;
        int total = 0;


        ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(2, 3, 4, 3, 2, 2));
        ArrayList<String> array2 = new ArrayList<String>(Arrays.asList("Harry", "Lavender", "Ron", "Hermione", "Luna", "Vincen"));

        Pair<Integer, String>[] array = new Pair[array1.size()];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = new Pair<Integer, String>(array1.get(i), array2.get(i));
        }

        System.out.println("This program prints the names of the student leaders from year 2, 3 and 4.\nTo see the list of the students from a specific year enter an integer between 2 and 4 when prompted.\n");

        do {
            while (true){
                try {
                    System.out.print("Enter Academic Year (2, 3 or 4): ");
                    num = input.nextInt();
                   exep = false;

                    if (!(num == 2 || num == 3 || num == 4))
                    {
                        //System.out.print("Incorrect input!");
                        throw new Exception();
                    }

                    else {
                        ArrayList<String> result = new ArrayList<>();
                        for (int i = 0; i < array.length; i++)
                        {
                            if (array[i].getKey().equals(num))
                            {
                                ++total;
                                result.add(array[i].getValue());


                            }
                        }
                        System.out.printf("Found %d leader(s) from year %d\nHere is the list:\n", total, num);
                        System.out.println(result);
                        break;
                    }
                }

                catch (Exception ex)
                {
                    System.out.print("Incorrect input!");
                    input.nextLine();
                }
            }

         System.out.print("Do you wish to continue? (Press y to continue or any other key to terminate):");
          cont = input.next().charAt(0);
        }
        while (cont=='y' || cont=='Y');

        TestingExecutionTime.myFooter(2,1);
    }
}

