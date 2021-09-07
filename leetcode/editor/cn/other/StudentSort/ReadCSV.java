
package other.StudentSort;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ReadCSV {

 /**
  * 获取学生
  * @param path
  * @return
  */
 public static List<Student> getStudent(String path) {
  List<Student> studentList = new ArrayList<>();
  try {
   File csv = new File(path); // CSV文件

   BufferedReader br = new BufferedReader(new FileReader(csv));



   // 读取直到最后一行
   String line = "";
   br.readLine();
   br.readLine();
   while ((line = br.readLine()) != null) {
    // 把一行数据分割成多个字段
    StringTokenizer st = new StringTokenizer(line, "/");

    while (st.hasMoreTokens()) {
     // 每一行的多个字段用，隔开表示
     String str = new String();
     str = st.nextToken() + ',';
     String[] split = str.split(",");
      Student student = new Student();
      //转换成对象
      student.setId(Integer.valueOf(split[0]));
      student.setName(split[1]);
      student.setSex(split[2]);
      student.setA0001Score(Double.valueOf(split[3]));
     student.setB0001Score(Double.valueOf(split[4]));
     student.setC0001Score(Double.valueOf(split[5]));
     student.setA0002Score(Double.valueOf(split[6]));
     student.setC0002Score(Double.valueOf(split[7]));
     student.setD0001Score(Double.valueOf(split[8]));
     student.setA0003Score(Double.valueOf(split[9]));
     studentList.add(student);
    }
   }

   br.close();

   return studentList;

  } catch (FileNotFoundException e) {
   // 捕获File对象生成时的异常
   e.printStackTrace();
  } catch (IOException e) {
   // 捕获BufferedReader对象关闭时的异常
   e.printStackTrace();
  }
  return studentList;
 }

 /**
  * 获取班级
  * @param path
  * @return
  */
 public static List<Course> getCourse(String path) {
  List<Course> coursesList = new ArrayList<>();
  try {
   File csv = new File(path); // CSV文件

   BufferedReader br = new BufferedReader(new FileReader(csv));



   // 读取直到最后一行
   String line = "";
   br.readLine();
   br.readLine();
   while ((line = br.readLine()) != null) {
    // 把一行数据分割成多个字段
    StringTokenizer st = new StringTokenizer(line, "/");

    while (st.hasMoreTokens()) {
     // 每一行的多个字段用，隔开表示
     String str = new String();
     str = st.nextToken() + ',';
     String[] split = str.split(",");
     Course course = new Course();
     //转换成对象
     course.setId(split[0]);
     course.setName(split[1]);
     course.setCredit(Integer.valueOf(split[2]));

     coursesList.add(course);
    }
   }

   br.close();

   return coursesList;

  } catch (FileNotFoundException e) {
   // 捕获File对象生成时的异常
   e.printStackTrace();
  } catch (IOException e) {
   // 捕获BufferedReader对象关闭时的异常
   e.printStackTrace();
  }
  return coursesList;
 }
}