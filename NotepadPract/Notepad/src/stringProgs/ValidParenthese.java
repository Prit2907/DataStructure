package stringProgs;

import java.util.Stack;

public class ValidParenthese
{
	public static void main(String[] args) 
	{

		boolean status=isValid("])}");
		if(status)
			System.out.println("valid");
		else
			System.out.println("Invalid");

	}
	public static boolean isValid(String s) {
		Stack<Character> p = new Stack<>(), q;
		for (int i = 0; i!=s.length(); i++) 
		{
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
			{
				p.push(s.charAt(i));
			} 
			else if(p.size() > 0) 
			{
				switch (s.charAt(i))
				{
				case ')': 
						if (p.peek() == '(') 
							p.pop(); 
						else
							return false;
						break;
				case ']': 
						if (p.peek() == '[')
							p.pop(); 
						else
							return false;
						break;
				case '}': 
						if (p.peek() == '{')
							p.pop(); 
						else
							return false;
						break;
				}
			}
			else
			{
				return false;
			}
		}
		return true;
	}
}
















//		for (auto it = s.rbegin(); it != s.rend(); ++it) {
//			if (*it == ')' || *it == '}' || *it == ']') {
//				q.push(*it);
//			} else if (q.size() > 0) {
//				switch (*it) {
//				case '(': if (q.pop() == ')') q.pop(); break;
//				case '[': if (q.pop() == ']') q.pop(); break;
//				case '{': if (q.pop() == '}') q.pop(); break;
//				}
//			}
//		}
//		return p.size() == 0 && q.size() == 0;