package hitopia;

import java.util.Stack;


public class BalancedBracket {
	
 public static boolean Bracket(String b) {  
	 // Call class stack
     Stack<Character> stk = new Stack<>();
     // Testing input with looping 
     for (int i = 0; i < b.length(); i++) {
         if (b.charAt(i) == '(' || b.charAt(i) == '{' || b.charAt(i) == '[') {
             stk.push(b.charAt(i)); 
         } 
         else {
             if (!stk.empty() && 
                 ((stk.peek() == '(' && b.charAt(i) == ')') ||
                  (stk.peek() == '{' && b.charAt(i) == '}') ||
                  (stk.peek() == '[' && b.charAt(i) == ']'))) {
                 stk.pop(); 
             }
             else {
                 return false;
             }
         }
     }

     return stk.empty();
 	}

 	public static void main(String[] args) {
 		// Input
 		String a = "{ ( ( [ ,] ) [,] ). [ ] } ";
 		// Replace input space and comma
 		a = a.replaceAll("\s","").replaceAll(",", "");
 		// Testing
 		if (Bracket(a))
 			System.out.println("YES");
 		else
 			System.out.println("NO");
 	}
}