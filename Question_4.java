
/**
 * Write a description of class Question_4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question_4
{
  int[] arr = {10, 20, 30, 40, 50};

for(int x = 1; x < arr.length - 1; x++)
{
arr[x + 1] = arr[x] + arr[x + 1];
}
/**Answer:{10, 20, 50, 90, 140}
 * This is the correct answer as the code adds the current element to the next
 * element each time it increases which is why it goes from 20 to 50 and 50 to 9
 * 90.
 * 
 * Answer I Chose {10, 20, 30, 70, 120}
 * This was probably a result of me misreading the header as 
 * (int x = 2; x < arr.length - 1; x++).
 * which would have resulted in this statement
 */
}
