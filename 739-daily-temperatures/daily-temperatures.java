class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] ans = new int[t.length];
         Stack<Integer> stack = new Stack<>();
         for(int i = 0; i<t.length; i++){
            while(!stack.isEmpty() && t[stack.peek()]<t[i]){
                int pop = stack.pop();
                ans[pop] = i-pop;
            }
            stack.push(i);
         }
         return ans;
    }
}