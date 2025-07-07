public class Arrays {

    public static void linearSearch(int  element, int []arr){
        for(int i=0; i<arr.length ; i++ ){
            if(arr[i] == element){
                System.out.println("Found at index:"+i);
                return;
            }
        }
        System.out.println("does not found");
    }

    public static int find_Largest(int [] arr){
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            max = Math.max(max,arr[i]);
        }
        System.out.println("largest element in array is: "+max);
        return max;
    }
    public static void sorted(int[]arr){

    }

    public static int binarySearch(int element, int []arr){
        int start = 0;
        int end = arr.length;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == element){
                System.out.println("element is found at: "+mid);
                return mid ;
            }else if(element > arr[mid]){
                start = mid+1 ;

            }else{
                end = mid-1;
            }
        }
        System.out.println("element not found");
        return -1;
    }

    public static void reverse_Array(int [] arr){
        int first =0 ;
        int last = arr.length -1;
        while(first < last){
            int temp;
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }

    public static void print_Pairs(int [] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length ; j++){
                System.out.print("("+arr[i]+" , "+arr[j]+")"+" ");
            }
            System.out.println();
        }
    }

    public static void print_Subarrays(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
            for(int j=i+1; j<arr.length;j++){
                int start=i;
                int end =j;
                for (int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    //brute force apporach
    public static void print_Sum_Subarrays(int [] arr){
        int largest = Integer.MIN_VALUE;
        int sum;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length;j++){
                sum=0;
                for (int k=i; k<=j; k++){
                    sum += arr[k];
                    System.out.println(sum);
                }

                largest = Math.max(largest,sum);
            }
        }
        System.out.println("largest subarray sum is: "+largest);
    }

    //    using prefix subarray
    public static void prefix_Sub(int [] arr){
        int [] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

    }
}

