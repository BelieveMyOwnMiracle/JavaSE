package practice;

import java.util.Scanner;

public class FrogJumpStaircaseProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入台阶总数(>0):");
        int steps = scanner.nextInt();
        System.out.println("总方案数:" + frogJump(steps));
    }
    /// ### 青蛙跳台阶问题
    /// 现在一共有n个台阶，一只青蛙每次只能跳一阶或是两阶，那么一共有多少种跳到顶端的方案？
    /// 例如n=2，那么一共有两种方案，一次性跳两阶或是每次跳一阶。
    /// 现在请你设计一个Java程序，计算当台阶数为n的情况下，能够有多少种方案到达顶端。
    public static int frogJump(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        return frogJump(n-1) + frogJump(n-2);
    }
}
