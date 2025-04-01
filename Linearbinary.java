import java.io.*;
class LinearBinary
{
 public static int liner(int arr[], int x)
 {
 for (int i = 0; i < arr.length; i++) 
 {
 if (arr[i] == x)
 return i;
 }
 return -1;
 }
 public static int binary(int arr[], int x)
 {
 int start = 0;
 int end = arr.length - 1;
 while (start <= end)
{
 int mid = (start + end) / 2;
 if (x == arr[mid]) 
 {
 return mid;
  }
 else if (x > arr[mid]) 
 {
 start = mid + 1;
 }
 else 
 {
 end = mid - 1;
 }
 }
 return -1;
 }
 public static void main(String[] args)
 {
 int arr[] = { 12, 114, 0, 4, 9 };
 int search = liner(arr,4); 
 System.out.println("Element found in the location (Linear Search) : "+search);
 int arr1[] = { 2, 4, 5, 7, 14, 17, 19, 22};
 int search1 = binary(arr1, 22);
 System.out.println("Element found in the location (Binary Search) : "+search1);
 }
}