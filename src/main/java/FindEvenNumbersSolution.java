/**
 * @author caobin05
 * @create 2019-12-2019/12/23 7:20 下午
 * @Overview 思路: 判断一个数字是否为偶数，从字符串的角度比较简单。因此，将整数转换为字符串, 判断字符串长度就好
 * @Doc
 */
public class FindEvenNumbersSolution {

    public int FindNumbers(int[] nums){
        // 设定一个计数器
        int evenNum = 0;
        String str ;
        // 遍历得到每一个数组元素
        for(int len = 0; len <= nums.length - 1; len ++) {
            // 将数组的每一个元素由整型转换为字符串
            str = Integer.toString(nums[len]);
            // 对字符串求长度，如果为偶数，计数器+1
            if (str.length() % 2 == 0) {
                evenNum++;
            }
        }
        return evenNum ;
    }

}
