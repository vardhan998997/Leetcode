class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens){
            if(token.equals("+") || token.equals("*") || token.equals("-") || token.equals("/")){
                int ele1 = stack.pop();
                int ele2 = stack.pop();
                int cal = 0;

                switch(token){
                    case "+" :
                     cal = ele1 + ele2;
                     break;
                    case "-" :
                     cal = ele2 - ele1;
                     break;
                    case "*" :
                     cal = ele1 * ele2;
                     break;
                    case "/" :
                     cal = ele2 / ele1;
                     break;   
                }
                stack.push(cal);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
