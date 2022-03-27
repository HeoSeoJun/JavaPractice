package generics;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // ����ñ��� ��밡���ϵ��� ����, cf. SOURCE�� �����ϱ���
@interface TestInfo {
	int count() default 1;
	String testedBy();
	String[] testTools() default "JUint";
	DateTime testDate();
}

@interface DateTime {
	String yymmdd();
	String hhmmss();
}

@Deprecated
@SuppressWarnings("1111") // ��ȿ���� ���� �ֳ����̼� ����
@TestInfo(testedBy="aaa", testTools = {"JUint", "JUint5"}, testDate = @DateTime(yymmdd="160101", hhmmss="235959"))
class Ex12_8 {
	public static void main(String[] args) {
		Class<Ex12_8> cls = Ex12_8.class;
		
		TestInfo anno = cls.getAnnotation(TestInfo.class);
		System.out.println("anno.testBy() = "+ anno.testedBy());
		System.out.println("anno.testDate().yymmdd() = "+ anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss() = "+ anno.testDate().hhmmss());
		
		for (String s : anno.testTools())
			System.out.println("testTool = "+s);
		System.out.println();
		
		Annotation[] annoArr = cls.getAnnotations();
		
		for (Annotation a : annoArr)
			System.out.println(a);
		
	} // main

}
