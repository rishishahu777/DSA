import java.util.*;

public class nextLargest{
    public static void main(String[] args) {
      
        int[] arr = {12, 3, 5, 6, 8};
        Deque<Integer> stack = new ArrayDeque<>();
        int n = arr.length;
        int[] result = new int[n];

        for(int i = n-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty())
                result[i] = -1;
            else
                result[i] = stack.peek();

            stack.push(arr[i]);
        }
        System.out.println(Arrays.toString(result));

    }
}