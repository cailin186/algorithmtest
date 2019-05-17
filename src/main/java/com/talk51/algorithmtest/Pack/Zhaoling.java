package com.talk51.algorithmtest.Pack;

public class Zhaoling {
    public static void main(String[] args) {
        greedyGiveMoney(7);
    }

    /**
     * 找零算法
     * @param money
     */
    public static void greedyGiveMoney(int money) {
        System.out.println("需要找零: " + money);
        int[] moneyLevel = {1, 5, 10, 20, 50, 100};
        for (int i = moneyLevel.length - 1; i >= 0; i--) {
            System.out.println("第:"+i+"次循环");
            System.out.println("金额:"+moneyLevel[i]);
            int num = money/ moneyLevel[i];
            System.out.println(num+"张");
            int mod = money % moneyLevel[i];
            money = mod;
            if (num > 0) {
                System.out.println("需要" + num + "张" + moneyLevel[i] + "块的");
            }
        }
    }
}
