
package other.StudentSort;

import java.io.*;

public class WriteCSV {

 public static  void Write(String str) {

  try
 {
  File csv = new File("C:\\Users\\zixuan.yang\\Desktop\\"); // CSV文件
  // 追记模式
  BufferedWriter bw = new BufferedWriter(new FileWriter(csv, true));
  // 新增一行数据
  bw.newLine();
  bw.write(str);
  bw.close();
 } catch(

 FileNotFoundException e)

 {
  // 捕获File对象生成时的异常
  e.printStackTrace();
 } catch(IOException e)

 {
  // 捕获BufferedWriter对象关闭时的异常
  e.printStackTrace();
 }
}
}