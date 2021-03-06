package t5;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	private float score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public Student(String name, int age, float score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	@Override
	public int compareTo(Student o) {
		if(score!=o.getScore()) {
			return (int)(o.getScore()-score);
		}
		return age-o.getAge();
	}
	

}
