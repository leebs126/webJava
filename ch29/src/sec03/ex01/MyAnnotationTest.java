package sec03.ex01;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MyAnnotationTest {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
//		Class st= Student.class;  //Class타입으로 리턴
		
		Method method = Student.class.getMethod("method1"); // 자바 리플렉션 getMethod로 메서드 method1을 얻어옵니다.
		Annotation[] annotations = method.getDeclaredAnnotations(); // 메서드에 선언된 어노테이션 객체를 얻어옵니다.

		for (Annotation annotation : annotations) {
			if (annotation instanceof MyAnnotation) {
				MyAnnotation myAnnotation = (MyAnnotation) annotation;
				System.out.println("name: " + myAnnotation.name()); // 어노테이션에 지정한 값을 출력합니다.
				System.out.println("address: " + myAnnotation.address());
			}
		}
		System.out.println();
		
		//method2 메소드에 선언된 MyAnnotation의 어노테이션 객체를 얻어옵니다.
		Annotation annotation = Student.class.getMethod("method2").getAnnotation(MyAnnotation.class); 
		if (annotation instanceof MyAnnotation) {
			MyAnnotation myAnnotation = (MyAnnotation) annotation;
			System.out.println("name: " + myAnnotation.name());
			System.out.println("address: " + myAnnotation.address());
		}
		System.out.println();
		
		//method3 메소드에 선언된 MyAnnotation의 어노테이션 객체를 얻어옵니다.
		annotation = Student.class.getMethod("method3").getAnnotation(MyAnnotation.class); 
		if (annotation instanceof MyAnnotation) {
			MyAnnotation myAnnotation = (MyAnnotation) annotation;
			System.out.println("name: " + myAnnotation.name());
			System.out.println("address: " + myAnnotation.address());
		}


	}

}
