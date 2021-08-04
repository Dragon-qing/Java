package t5;

import java.util.Arrays;
import java.util.Comparator;
public class t5Test {
	public static void main(String[]args) {
		Student[] stu=new Student[] {
				new Student("liusan",20,90.0F),
				new Student("lisi",22,90.0F),
				new Student("wangwu",20,99.0F),
				new Student("sunliu",22,100.0F)
		};
		System.out.println("Comparable:");
		Arrays.sort(stu);
		for(Student s:stu) {
			System.out.println(s);
		}
		stu[1].setScore(60);
		stu[3].setAge(19);
		System.out.println("Comparator:");
		Arrays.sort(stu,(Student o1, Student o2)->{
				if(o1.getScore()!=o2.getScore())
					return (int)(o2.getScore()-o1.getScore());
				return o1.getAge()-o2.getAge();
			}
			
		);
		for(Student s:stu) {
			System.out.println(s);
		}
	}
}
