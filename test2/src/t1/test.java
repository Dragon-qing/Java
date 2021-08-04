package t1;

public class test {
	public static void main(String []args) {
		Course c=new Course(1,"英语","王晴",true);
		System.out.println(c);
		c.setCno(2);
		c.setName("大学生创业基础理论 ");
		c.setRequired(false);
		c.setTeacher("王刚");
		System.out.println(c.getCno()+" "+c.getName()+" "+c.getTeacher()+" "+c.isRequired());
	}
}
