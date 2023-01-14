class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> notation = new Stack();
        for(int i=0; i<tokens.length; i++){
            if(tokens[i].equals("+")){
                int a = notation.pop();
                int b = notation.pop();
                notation.push(a+b);
            }
            else if(tokens[i].equals("-")){
                int a = notation.pop();
                int b = notation.pop();
                notation.push(b-a);
            }
            else if(tokens[i].equals("*")){
                int a = notation.pop();
                int b = notation.pop();
                notation.push(a*b);
            }
            else if(tokens[i].equals("/")){
                int a = notation.pop();
                int b = notation.pop();
                notation.push(b/a);
            }
            else{
                notation.push(Integer.valueOf(tokens[i]));
            }
        }
        return notation.pop();
    }
}