import java.util.Scanner;

/**
   This program demonstrates the search method in
   the ObjectBinarySearcher class.
*/

public class Main
{
   public static void main(String [] args)
   {
      int result;
      String searchValue;
      String input;

      // Create a String array with test values.
      String[] values = { "Zeb", "Deb", "Will", "Karen",
                          "Aaron", "Chris", "Barb", "Kenny" };

      // Create a Scanner object to read keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Sort the array.
      ObjectQuickSorter.quickSort(values);

      // Display the array's contents.
      System.out.println("Array contents: ");
      for (String element : values)
         System.out.print(element + " ");
      System.out.println();

      do
      {
         // Get a value to search for.
         System.out.print("Enter a value to search for: ");
         searchValue = keyboard.nextLine();

         // Search for the value
         result = ObjectBinarySearcher.search(values, searchValue);

        // Display the results.
        if (result == -1)
           System.out.println(searchValue + " was not found.");
        else
        {
           System.out.println(searchValue + " was found at " +
                              "element " + result);
        }

        // Does the user want to search again?
        System.out.print("Do you want to search again? (Y or N): ");
        input = keyboard.nextLine();
      } while (input.charAt(0) == 'y' || input.charAt(0) == 'Y');
   }
}
