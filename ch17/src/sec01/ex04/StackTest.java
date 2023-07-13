package sec01.ex04;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("홍길동");
		stack.push("이순신");
		stack.push(new Integer(111));
		stack.push(new Student());
		
		Student s1 = (Student)stack.peek();
		System.out.println(s1);
		System.out.println();
		
		System.out.println(stack.toString());
		System.out.println();
		
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		System.out.println();
		System.out.println(stack.toString());

	}

}
