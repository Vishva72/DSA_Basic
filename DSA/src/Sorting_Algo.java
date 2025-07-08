public class Sorting_Algo {

    public static void bubble_Sort(int [] arr){
        for(int i=0; i<arr.length-1 ; i++){
            for(int j=0; j< arr.length-i-1; j++){
                if(arr[j] < arr[j+1] ){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selection_Sort(int[]arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void insertion_sort(int[]arr){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr ){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void counting_Sort(int[]arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest ,arr[i]);
        }
        int[]count = new int [largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    //    Divide and Conquer
    public static void mergeSort(int arr[],int si , int ei){
        if(si >= ei){
            return;
        }
        int mid = ( si+( (ei-si)/2 ) );
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,ei,mid);
    }
    public static void merge(int[]arr,int si,int ei,int mid){
        int[]temp = new int[(ei-si)+1];
        int i= si;
        int j = mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            } else  {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            temp[k] = arr[i];
            i++;k++;
        }
        while (j<= ei){
            temp[k] = arr[j];
            j++;k++;
        }
        for(k=0,i=si ; k<temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }

    public static void quickSort(int[]arr,int si ,int ei){
        if(si>=ei){
            return;
        }
        int pidx = partitation(arr,si,ei);
        quickSort(arr,si,pidx-1);
        quickSort(arr,pidx+1,ei);
    }
    public static int partitation(int arr[] ,int si , int ei){
        int pivot  = arr[ei];
        int i= si-1;
        for(int j=si;j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                int temp;
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] =temp;
        return i;
    }
}

