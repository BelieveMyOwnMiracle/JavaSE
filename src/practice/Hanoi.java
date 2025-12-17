package practice;

import java.util.Scanner;

public class Hanoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入汉诺塔的圆盘数量 n：");
        int n = scanner.nextInt();
        scanner.close();

        // 校验输入（n需为正整数）
        if (n <= 0) {
            System.out.println("错误：圆盘数量必须是正整数！");
            return;
        }

        // 执行汉诺塔算法（A=源柱，B=辅助柱，C=目标柱）
        System.out.println("===== " + n + " 阶汉诺塔移动步骤 =====");
        HanoiSteps(n, 'A', 'B', 'C');
        System.out.println("===== 移动完成！总步数：" + stepCount + " =====");
    }

    private static int stepCount = 0;
    /// ### 汉诺塔求解
    ///
    /// 什么是汉诺塔？
    ///
    /// > **汉诺塔**（Tower of Hanoi），又称**河内塔**，是一个源于[印度](https://baike.baidu.com/item/印度/121904)古老传说的[益智玩具](https://baike.baidu.com/item/益智玩具/223159)。[大梵天](https://baike.baidu.com/item/大梵天/711550)创造世界的时候做了三根金刚石柱子，在一根柱子上从下往上按照大小顺序摞着64片黄金圆盘。大梵天命令[婆罗门](https://baike.baidu.com/item/婆罗门/1796550)把圆盘从下面开始
    /// >
    /// > **按大小顺序重新摆放在另一根柱子上。并且规定，在小圆盘上不能放大圆盘，在三根柱子之间一次只能移动一个圆盘。**
    ///
    /// 这三根柱子我们就依次命名为A、B、C，现在请你设计一个Java程序，计算N阶（n片圆盘）汉诺塔移动操作的每一步。
    public static void HanoiSteps(int n, char source, char support, char target){
        if(n == 1){
            stepCount++;
            System.out.printf("步骤%d:将圆盘1从%c移动到%c\n", stepCount,source,target);
            return;
        }
        HanoiSteps(n-1,source,target,support);
        stepCount++;
        System.out.printf("步骤%d:将圆盘%d从%c移动到%c\n", stepCount,n,source,target);
        HanoiSteps(n-1,support,source,target);
    }
}
