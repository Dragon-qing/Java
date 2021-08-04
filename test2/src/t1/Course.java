package t1;

public class Course {
private int cno;
private String name;
private String teacher;
private boolean required;		//true为必修false为选修
public Course(int cno,String name,String teacher,boolean state) {
	this.cno=cno;
	this.name=name;
	this.teacher=teacher;
	this.required=state;
}
@Override
public String toString() {
	return "{cno="+cno+" name="+name+" teacher="+teacher+" required="+required+"}";
}
public int getCno() {
	return cno;
}
public void setCno(int cno) {
	this.cno = cno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTeacher() {
	return teacher;
}
public void setTeacher(String teacher) {
	this.teacher = teacher;
}
public boolean isRequired() {
	return required;
}
public void setRequired(boolean state) {
	this.required = state;
}

}
