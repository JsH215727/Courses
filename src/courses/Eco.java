package courses;

public class Eco extends Curriculum{
	
	public Eco(){
		
		this.courseName="Econ";
		this.grade='A';
		this.numStudents=100;
		this.numTeacher=1;
		this.schoolType="College";
		this.syllabus=true;
		this.teacherName="Dr. Quach";
		this.topic="Eco";
	}

	@Override
	public String toString() {
		return "Eco [grade=" + grade + ", syllabus=" + syllabus
				+ ", teacherName=" + teacherName + ", courseName=" + courseName
				+ ", schoolType=" + schoolType + ", topic=" + topic
				+ ", numStudents=" + numStudents + ", numTeacher=" + numTeacher
				+ "]";
	}
	
	
	
	
	
	
}

























