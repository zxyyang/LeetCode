//给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。 
//
// 如果反转后整数超过 32 位的有符号整数的范围 [−231, 231 − 1] ，就返回 0。 
//假设环境不允许存储 64 位整数（有符号或无符号）。
//
// 
//
// 示例 1： 
//
// 
//输入：x = 123
//输出：321
// 
//
// 示例 2： 
//
// 
//输入：x = -123
//输出：-321
// 
//
// 示例 3： 
//
// 
//输入：x = 120
//输出：21
// 
//
// 示例 4： 
//
// 
//输入：x = 0
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// -231 <= x <= 231 - 1 
// 
// Related Topics 数学 
// 👍 2973 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public static int reverse(int x) {
        double c = Math.pow(2, 31);

        if (x<= -c || x>= c-1)
        {return 0;}

        //判断不为空
        int last ;
        int flag ;
        int y=0;
        String str = new String();
        List<Integer> all = new ArrayList();
        //取绝对值
        //取出符号
        if(x<0){
            flag = 1;//负数

        }
        else {
            flag = 0;//正数

        }
        y = Math.abs(x);
        while (y>0){
            //每次取最后一位
            last = y % 10;
            //每次添加最后一个进去
            all.add(last);
            //缩小一位
            y = y/10;
        }
        if(all != null){
            for (Integer tmp : all) {
                str = str + tmp;
            }
            try {

                x = Integer.valueOf(str).intValue();

            } catch (NumberFormatException e) {

                e.printStackTrace();

            }

        }

        if (flag == 0){
            return x;
        }else {
            return -x;
        }





    }
}
//leetcode submit region end(Prohibit modification and deletion)
