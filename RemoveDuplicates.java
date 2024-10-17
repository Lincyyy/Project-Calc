package Project.Set2;
public class RemoveDuplicates{
public  public static int removeDuplicates(int[] nums) {
    if (nums.length == 0) 
        return 0;

    int uniqueIndex = 1; // Start from the second element
    
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] != nums[i - 1]) {
            nums[uniqueIndex] = nums[i];
            uniqueIndex++;
        }
    }
    
    return uniqueIndex; // Return the new length
}

public static void main(String[] args) {
    int[] array = {1, 1, 2, 2, 3, 4, 4};
    int newLength = removeDuplicates(array);
    
    System.out.print("Array after removing duplicates: ");
    for (int i = 0; i < newLength; i++) {
        System.out.print(array[i] + " ");
    }
}}