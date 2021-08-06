  //编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 
//
// 示例 1： 
//
// 
//输入：strs = ["flower","flow","flight"]
//输出："fl"
// 
//
// 示例 2： 
//
// 
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。 
//
// 
//
// 提示： 
//
// 
// 1 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] 仅由小写英文字母组成 
// 
// Related Topics 字符串 
// 👍 1713 👎 0

  import java.util.ArrayList;
  import java.util.List;

  class LongestCommonPrefix{
      public static void main(String[] args) {
           Solution solution = new LongestCommonPrefix().new Solution();
          String[] strings = {"ab","a"};
          System.out.println(solution.longestCommonPrefix(strings));
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        String[] one= strs[0].split("");
        for(int i=1;i<strs.length;i++){
            String[]tow =  toString(strs[i]);
            int len = one.length;
            if (tow.length < len){
                len = tow.length;
            }
            int aa = 0;
            for (int j=0;j<len;j++){
                if(one[j].equals(tow[j])){
                    aa++;
                }else {
                    for (int k =j+1;k<one.length;k++) {
                        one[k] = "";
                    }
                }
            }
            for (int j = aa; j < len;j++){
                one[j] = "";
            }

        }

        for (String re : one){
            result = result+re;
        }

        return   String.valueOf(result);
    }

          public  String[] toString(String str) {
              String[] strs = str.split("");


              return strs;
          }
}
//leetcode submit region end(Prohibit modification and deletion)

  }
