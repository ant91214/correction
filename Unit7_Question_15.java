
/**
 * Write a description of class Unit7_Question_15 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit7_Question_15
{
    public int seqSearch(int[] arr, int target)
{
for (int j = 0; j < arr.length; j++)
{
if (arr[j] == target)
{
return j;
}
}
return -1;
}
Consider another method, seqSearch2, which modifies seqSearch to use an enhanced
 for loop.
public int seqSearch2(int[] arr, int target)
{
for (int j : arr)
{
if (j == target)
{
return j;
}
}
return -1;
}
/**Answer:The modification in seqSearch2 will cause the value of target to be
 * returned instead of the index of target in cases where target appears in arr.
 * 
 * I missed this because I thought the modification would have no effect
 */
}
