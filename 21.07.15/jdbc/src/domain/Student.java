package domain;

public class Student {
    private String studentId;
    private String studentName;
    private String studentSex;
    private String studentSchool;

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentSex='" + studentSex + '\'' +
                ", studentSchool='" + studentSchool + '\'' +
                '}';
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public void setStudentSchool(String studentSchool) {
        this.studentSchool = studentSchool;
    }
}
