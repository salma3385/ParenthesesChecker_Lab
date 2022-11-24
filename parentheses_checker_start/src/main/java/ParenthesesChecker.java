import java.util.Stack;

public class ParenthesesChecker {
    //public testString;

    //First in last out *IMPORTANT*
    // If there is a match, the elements will pop out of the stack and will give a true  and the next element will be analysed
    //if there is no match there will be a false use the push method
    //need to do an enhanced for loop
    // Valid: ""()(())
    //Invalid: ) ( ())  (()
    // if it is an empty string return true
    //charAt to access each character
    // stack peek is used to retrieve or fetch the first element of the stack
    public static <checkParentheses, test> boolean main(String[] args, Object testString, String toCharArray) {

        String Str = "()(())()(()())";
        char[] charArray = Str.toCharArray();
        String str = null;
        return false;
    }

    public boolean checkParentheses(String testString) {
        Stack<Character> stack = new Stack<>();
        for (char p : testString.toCharArray()) {
            if (p == '('){
                stack.push(p);
            } else if (p == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            }

            }
            return true;
        }

    }






