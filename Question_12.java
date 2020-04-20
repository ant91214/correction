
/**
 * Write a description of class Question_12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question_12
{
//   numArr initially contains {1, 3, 5, 7, 9}, it should contain 
//{9, 7, 5, 3, 1} after the code segment executes.

   /* missing loop header */ 
  for (int k = 0; k < numArr.length / 2; k++) {
int temp = numArr[k];
numArr[k] = numArr[numArr.length - k - 1];
numArr[numArr.length - k - 1] = temp;
}
/**Answer for (int k = 0; k < numArr.length / 2; k++)
 *  
 *  This answer is correct as in order for the array to be reversed it must 
 *  terminate in the middle of the array and not at the end of the array like 
 *  I had expected
 */
}
