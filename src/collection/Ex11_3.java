package collection;

import java.util.EmptyStackException;
import java.util.Stack;

public class Ex11_3 {

	public static void main(String[] args) {
		String expression = "((3+5)*(7-(4*2))";
		Stack<String> st = new Stack<String>();
		
		System.out.println("expression = "+expression);
		
		try {
			for (int i = 0; i < expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if (ch == '(') {
					st.push(ch + "");
				} else if (ch == ')') {
					st.pop();
				}
			}
			
			if (st.isEmpty()) System.out.println("괄호 수 일치!");
			else System.out.println("괄호 수 불일치");
		} catch (EmptyStackException e) {
			System.out.println("괄호 수가 일치하지 않아요.");
		} // try
	}

}
