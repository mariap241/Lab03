package edu.ru.lab03;

public class MainClass {

    public static void binarySearch(int arr[], int first, int last, int key) {
        
       //initalized int variable that is avg # in array (split array in two)
        int mid = (first + last) / 2;
        
        //create loop to look through array
        while (first <= last) {
            
            //compare key to mid index
            if (arr[mid] < key) {
                
                //mid less than key, look at next higher index (second half of array) 
                first = mid + 1;
                
              //if mid is equal to key, index is found and print  
            } else if (arr[mid] == key) {
                System.out.println("Element is found at index: " + mid);
               
                //end loop (index found)
                break;
              
            // mid greater than key, look at first half of array 
            } else {
                last = mid - 1;
            }
            
            //find new mid point in first half of array
            mid = (first + last) / 2;
        }
        
        if (first > last) {
            System.out.println("Element is not found!");
        }
    }

    public static void main(String args[]) {
        
        //intialized int array
        int arr[] = {10, 20, 30, 40, 50};
        
        //initialized and set key variable
        
        int key = 30;
        
        //initialized and set last index variable 
        int last = arr.length - 1;
        
        //call by reference to binary search method
        binarySearch(arr, 0, last, key);
    }
}
