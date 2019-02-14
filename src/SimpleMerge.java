/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2) {
    int n=arr.length;
    int[] temp=new int[n];
    mergeSortHelper(arr, left:0, right:n-1, temp);
    }
    private static void merge(int[] arr, int left, int mid, int right, int[] temp){
        int i=left;
        int j=mid+1;
        int k=left;
        while (i<=mid&&j<=right){
            if (arr[j],arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i<=mid)
        {
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=right){
            temp[k]=arr[j];
            j++;
            k++;
        }
        for(k=left;k<=right;k++){
            arr[k]=temp[k];
        }
    }

}
