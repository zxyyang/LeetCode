
package other.StudentSort;

import java.util.ArrayList;
import java.util.List;

public class StudentApp {
static 	String  studentPath = "C:\\Users\\zixuan.yang\\Desktop\\studentScoresWithCourseId.csv";
static 	String coursePath = "C:\\Users\\zixuan.yang\\Desktop\\courses.csv";
	//获取学生和课程
static 	List<Student> studentList = ReadCSV.getStudent(studentPath);
static 	List<Course> courseList = ReadCSV.getCourse(coursePath);
		//获取权值
	static Integer selectCredit(String id){
		for (Course core:courseList) {
			if (core.getId().equals(id)){
				return core.getCredit() /10;
			}

		}
		return 0;
	}
	//获取平均值
static 	void getAveScore(){
		//求加权平均
		int size = courseList.size();
		for (Student student:studentList) {
			double A0001 = student.getA0001Score() * selectCredit("A0001");
			double B0001 = student.getB0001Score() * selectCredit("B0001");
			double C0001 = student.getC0001Score() * selectCredit("C0001");
			double A0002 = student.getA0002Score() * selectCredit("A0002");
			double C0002 = student.getC0002Score() * selectCredit("C0002");
			double D0001 = student.getD0001Score() * selectCredit("D0001");
			double A0003 = student.getA0003Score() * selectCredit("A0003");
			double sum = A0001 + B0001 +C0001 +A0002 +C0002 +D0001 +A0003;

			double aveScore = sum/size;


			student.setAveScores(aveScore);

		}

	for (Student sort : studentList) {
		System.out.println(sort.getName() +":"+ sort.getAveScores());
	}
	System.out.println("加权平均值获取成功");
	}

	static void getSort(){
//		if (studentList == null) {
//			System.out.println("学生表为空！");
//			return;
//		}
//		if (studentList.size() < 1 ) return;
		for (int i = 0; i < studentList.size() ; i++) {
			//     boolean flag = false;
			for (int j = 0; j < studentList.size() - i - 1; j++) {
				//数组下标又是从0开始的，
				if ((studentList.get(j).getAveScores()) < (studentList.get(j+1).getAveScores())) {   //相邻数组为逆序
					Student temp = studentList.get(j);
					studentList.set(j, studentList.get(j+1));
					studentList.set(j+1,temp);
					//        flag = true;
				}
			}
			//   if (!flag) break;
		}

		for (Student sort : studentList) {
			System.out.println(sort.getName() +":"+ sort.getAveScores());
		}


	}

	static List<List<Student>> group(){
		List<Student> A =new ArrayList<>();
		List<Student> B =new ArrayList<>();
		List<Student> C =new ArrayList<>();
		List<Student> D=new ArrayList<>();
		List<Student> E =new ArrayList<>();

		List<List<Student>> groupList = new ArrayList<>();

	for (Student student:studentList){
		if (student.getAveScores() >90){
			A.add(student);
		}
		else if(student.getAveScores() >=80 && student.getAveScores()< 90){
			B.add(student);
		}
		else if(student.getAveScores() >=70 && student.getAveScores()< 80){
			C.add(student);
		}
		else if(student.getAveScores() >= 60 && student.getAveScores()< 70){
			D.add(student);
		}
		else if(student.getAveScores() < 60 ){
			E.add(student);
		}
	}
		groupList.add(A);
		groupList.add(B);
		groupList.add(C);
		groupList.add(D);
		groupList.add(E);


		return groupList;


	}

	public static void main(String[] args) {
		getAveScore();
		System.out.println("====================================");
		System.out.println("排序后结果：");
			getSort();
		System.out.println("====================================");
		System.out.println("前五名：");
		for (int i = 0; i < 5; i++) {
			System.out.println("名次："+ (i+1) +","+studentList.get(i).getName()+","+studentList.get(i).getId()+","+ studentList.get(i).getSex()+","+studentList.get(i).getAveScores());

		}
		System.out.println("====================================");
		System.out.println("分组：");
		List<List<Student>> group = group();

			System.out.print("A组：");
			for (Student student : group.get(0)) {
				System.out.println(student.getId() + "," + student.getName() + "," + student.getSex() + "," + student.getAveScores());
				System.out.println();
			}
		System.out.print("B组：");
		for (Student student : group.get(1)) {
			System.out.println(student.getId() + "," + student.getName() + "," + student.getSex() + "," + student.getAveScores());
			System.out.println();
		}
		System.out.print("C组：");
		for (Student student : group.get(2)) {
			System.out.println(student.getId() + "," + student.getName() + "," + student.getSex() + "," + student.getAveScores());
			System.out.println();
		}
		System.out.print("D组：");
		for (Student student : group.get(3)) {
			System.out.println(student.getId() + "," + student.getName() + "," + student.getSex() + "," + student.getAveScores());
			System.out.println();
		}
		System.out.print("E组：");
		for (Student student : group.get(4)) {
			System.out.println(student.getId() + "," + student.getName() + "," + student.getSex() + "," + student.getAveScores());
			System.out.println();
		}

		System.out.println("====================================");
		System.out.println("分组：");

	}






}