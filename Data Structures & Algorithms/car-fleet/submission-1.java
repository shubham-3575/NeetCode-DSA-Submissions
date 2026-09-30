class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        HashMap<Integer, Integer> pairs = new HashMap<>();
        for(int i=0;i<n;i++){
            pairs.put(position[i],speed[i]);
        }
        Arrays.sort(position);
        for(int i=0;i<n/2;i++){
            int temp = position[i];
            position[i] = position[n-i-1];
            position[n-i-1] = temp;
        }
        Stack<Double> stk = new Stack<>();
        for(int i=0;i<n;i++){
            double time = (double)(target-position[i])/pairs.get(position[i]);
            if(!stk.isEmpty() && stk.peek()>=time)
                continue;
            stk.push(time);
        }
        return stk.size();
    }
}
