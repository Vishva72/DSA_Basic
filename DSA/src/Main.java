//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int [] arr = {-5,4,-1,3,2};
//        basic techniques
        Arrays.linearSearch(17,arr);
        Arrays.find_Largest(arr);
        Arrays.binarySearch(26,arr);
        Arrays.reverse_Array(arr);
        Arrays.print_Pairs(arr);
        Arrays.print_Subarrays(arr);
        Arrays.print_Sum_Subarrays(arr);
//----------------------------------------------------------------------------------------
        //        sorting funtions
        Sorting_Algo.bubble_Sort(arr);
        Sorting_Algo.selection_Sort(arr);
        Sorting_Algo.insertion_sort(arr);
        Sorting_Algo.counting_Sort(arr);
        Sorting_Algo.mergeSort(arr,0, arr.length-1);
        Sorting_Algo.quickSort(arr,0,arr.length-1);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}