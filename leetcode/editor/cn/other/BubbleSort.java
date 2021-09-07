package other;

import javax.naming.PartialResultException;

public class BubbleSort {
    public static void bubbleSort(Integer[] arr) {

        if (arr == null) {
            System.out.println("null");
            return;
        }
            if (arr.length <1 ) return;
            for (int i = 0; i < arr.length -1; i++) {
           //     boolean flag = false;
                for (int j = 0; j < arr.length - i - 1; j++) {
                    //数组下标又是从0开始的，
                    if (arr[j] > arr[j + 1]) {   //相邻数组为逆序
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                //        flag = true;
                    }
                }
             //   if (!flag) break;
            }

            for (Integer sort : arr) {
                System.out.println(sort);
            }



    }


    public static void main(String[] args) {
        Integer[] arr  = {7,5,3,1,5,4,6};
        Integer[] one = {1};
        Integer[] sort = {1,2,3,4,5,6};
        Integer[] re = { 6,5,4,3,2,1};
        Integer[] no = null;
        System.out.println("---need");
            bubbleSort(arr);
        System.out.println("---one");
        bubbleSort(one);
        System.out.println("---sort");
        bubbleSort(sort);
        System.out.println("---re");
        bubbleSort(re);
        System.out.println("---null");
        bubbleSort(no);


    }
}
