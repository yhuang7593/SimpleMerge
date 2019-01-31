public class mergeSortHelper {int[] arr, int left, int right, int[] temp){
    if(left<right){
        int mid=(left+right)/2;
        mergeSortHelpful(arr, left, mid, temp);
        mergeSortHelpful(arr, left:mid+1, right, temp);
        merge(arr, left, mid, right, temp);
    }
}

}
