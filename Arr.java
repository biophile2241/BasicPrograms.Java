import java.util.Scanner;
import  java.util.Arrays;
public class Arr{

 static Scanner sc = new Scanner(System.in); // Declare scanner object here

    static void print(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static int[] ceateArray(){
      System.out.print("Enter the length of array: ");
      int n = sc.nextInt();
      int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + i + "th element of array: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[] inverse(int[] array){
        for(int i=0; i<array.length/2; i++){
            int start = array[i];
            int last = array[(array.length-1)-i];
            array[(array.length-1)-i]=start;
            array[i]=last;
        }
        return array;
    }

    public static int binarySearch(int[] arr, int a){
        int s=0;
        int e=arr.length-1;
        int index=-1;
        while(s<=e){
            int m= (s+e)/2;
            if(arr[m]==a){
             index = m;
             break;  
            }
            else if(arr[m]>a){
             e=m-1;
            }
            else{
                s=m+1;
            }
        }
            return index;
        }
// largest element sum - arr[i]
        public static void series(int[] arr){
           Arrays.sort(arr);
           int n =arr[arr.length -1];
           int sum = (n*(n+1))/2;
           for(int i=0; i<arr.length; i++){
            sum = sum-arr[i];
           }
           System.out.println(sum);
        }

// optimization of above problem from O(n^2) to O(2n)
        public static int[] pro2(int[] a){
            int[] pro = new int[a.length];
            int p =1;
            int in0=-1;
            for(int i=0; i>a.length; i++){//for each loop
                if(a[i] != 0){
                    p*= a[i];
                }
                else{in0=i;}
            }
            System.out.print(p);
            for(int i=0; i>a.length;i++){
               if(in0>=0 || in0!=i){
                pro[i]=0;
               }
               else{
                pro[i]=p/a[i];
               }
            }
            return pro;
        }
    //Sorting Algorithms
    public static int[] bubbleSort(int[] a){
         for(int i = 0; i< a.length; i++){
         boolean flag = true;
         for(int j= 0; j< a.length-1; j++){
             if(a[j]>a[j+1]){
                a[j]=a[j]^a[j+1];
                a[j+1] = a[j]^a[j+1];
                a[j]=a[j]^a[j+1];
             }
             else{
             flag = false;
             }
            }
            if(flag== true){
               break;
            }
            }
            return a;
        }

    /*  if(start < end){
        s1->calculate mid
        s1->divide-left-array(start, mid)
        s1->divide-left-array(mid+1, end)
        s4->merge(start, mid, end)
        } 
    */
     int[] mergeSort(int arr[])
            {   
             Arr n= new Arr();
                int l= arr.length;
                int m = l/2;
                // Find sizes of two subarrays to be merged
                int n1 = m;   // First subarray is arr[0..m]
                int n2 = l-m; // Second subarray is arr[m+1..l]
        
                // Create temp arrays
                int L[] = new int[n1];
                int R[] = new int[n2];
        
                // Copy data to temp arrays
                for (int i = 0; i < n1; ++i)
                    L[i] = arr[i];
                    n.arrPrint(L);
                for (int j = 0; j < n2; ++j)
                    R[j] = arr[m+j];
                    n.arrPrint(R);

                // Merge the temp arrays
                return merge(L, R);
        } 
        
        // Merges two subarrays of arr[].
        public static int[] merge(int[]a, int[]b){
            int[] merge = new int[a.length + b.length];//new array
            int i=0,  j = 0, k=0;//index variable for a, b, merge arrays
            while( i< a.length && j< b.length){ //coping elms to new array
                   if(a[i]<b[j]){
                    merge[k++]=a[i++];
                   }else{
                    merge[k++]=b[j++];
                   }
            }
            while(i<a.length){
              merge[k++]=a[i++];
            }
            while(j<b.length){
              merge[k++]=b[j++];
            }
            return merge;
        }

        public static void main(String[] args) {
       
        int[] a = {0,2,3,4};
        int[] b = {98,63,84, 98};
        // print(a);
        // int b[]= pro(a);
        // int c[]= pro2(a);
        // int [] c = merge(a, b);
        // ArrPrint(c); 
        // System.out.println(binarySearch(a, 0));
        // System.out.println(binarySearch(b, 84));
        //mergeSort(b);
        bubbleSort(b);
        print(b);
            
        }
}
    
