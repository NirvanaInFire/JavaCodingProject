/**
 * @author 玉面小达摩
 * @create 2019-12-2019/12/22 2:49 下午
 * @Overview
 * @Doc
 */
public class subtractProductAndSumSolution {

    // 通过将数值转换为字符串 进行分拆每一位的值
    public int subtractProductAndSum(int n) {
        // 将整型数据变为字符串
        String dataInt = Integer.toString(n);
        // 初始化积与和
        Integer sumTotal = 0;
        Integer productTotal = 1;

        for(int index = 0; index < dataInt.length(); index ++){

            sumTotal += (dataInt.charAt(index) - '0');
            productTotal *= (dataInt.charAt(index) - '0');
        }
        return productTotal - sumTotal;
    }




}