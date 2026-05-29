import java.util.Arrays;
public class duplicate {
    static int duplicateItem(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);

        for(int i = 0; i < n; i++){
            if(arr[i] == arr[i+1])
                return arr[i];
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1,3,4,2,2,5};
        System.out.println(duplicateItem(arr));
    }
}