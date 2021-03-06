package interview.before;

/**
 * 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 *
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */
public class NumAppearOnce {

    public static void main(String[] args){
        int[] in = {1,3,1};
        NumAppearOnce num = new NumAppearOnce();
        System.out.println(num.singleNumber(in));
    }

    // Solution: Use ^(异或);same number return 0;
    public int singleNumber(int[] nums) {
        int retNum=0;
        for (int i=0;i<nums.length;i++) {
            retNum = retNum ^ nums[i];
        }
        return retNum;
    }
}
