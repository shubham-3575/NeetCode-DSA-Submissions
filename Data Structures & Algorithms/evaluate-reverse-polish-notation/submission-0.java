class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> eval = new Stack<>();
       for(String token : tokens){
            int val1, val2;
            switch(token){
                case "+":
                    val1 = eval.pop();
                    val2 = eval.pop();
                    eval.push(val1+val2);
                    break;
                case "-":
                    val1 = eval.pop();
                    val2 = eval.pop();
                    eval.push(val2-val1);
                    break;
                case "*":
                    val1 = eval.pop();
                    val2 = eval.pop();
                    eval.push(val1*val2);
                    break;
                case "/":
                    val1 = eval.pop();
                    val2 = eval.pop();
                    eval.push(val2/val1);
                    break;
                default:
                        eval.push(Integer.parseInt(token));
                    break;
            }
       }
       return eval.peek(); 
    }
}
