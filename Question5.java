import java.util.Scanner;


public class Question5 {
  public static void main(String[] args) {
    /**
     * Prompt the user for number. This input indicates the number of integers the
     * user will be entering next. Print out the mode (highest occurrence) from the
     * set of integers. e.g. > 5 > 2 > 4 > 1 > 3 > 4 4
     * 
     * e.g. > 4 > 2 > 2 > 3 > 3 2 Hint: Use a loop to get input. Use another 2 loops
     * to find the mode
     */

    Scanner in = new Scanner(System.in);
    
    int number = in.nextInt();
    int mode = 0;
    int count = 0;
    int[] data = new int[number];

    for (int i = 0; i < number; i++) {
      
      data[i] = in.nextInt();

    }

    for (int k : data) {
      int currentcount = 0;

      for (int j = 0; j < data.length; j++) {
        if (data[k] == data[j]) {
          currentcount++;
        }
        if (currentcount > count) {
          count = currentcount;
          mode = data[k];

        }

      }

    }
    System.out.println(mode);

  }
}
