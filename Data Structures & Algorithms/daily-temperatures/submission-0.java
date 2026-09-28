class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int res[] = new int[temperatures.length];
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<res.length;i++){
            while(!stk.isEmpty()&&temperatures[i]>temperatures[stk.peek()]){
                int prevDay = stk.pop();
                res[prevDay] = i-prevDay;
            }
            stk.push(i);
        }
        return res;
    }
}
