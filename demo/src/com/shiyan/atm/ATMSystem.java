package com.shiyan.atm;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * ATM 系统入口类
 */
public class ATMSystem {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=============世晏ATM系统==============");
            System.out.println("1.账户登录");
            System.out.println("2.注册账户");

            int command = sc.nextInt();

            switch (command) {
                case 1:
                    // 用户登录
                    break;
                case 2:
                    // 账户开户
                    register(accounts, sc);
                    break;
                default:
                    System.out.println("您输入的命令不存在~~");
            }
        }

    }

    /**
     * 用户开户功能实现
     * @param accounts 接受的账户集合
     */
    private static void register(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("===============系统开户操作================");

        Account account = new Account();

        System.out.println("请输入用户名：");
        String userName = sc.next();
        account.setUserName(userName);

        while (true) {
            System.out.println("请输入密码：");
            String password = sc.next();
            System.out.println("请确认密码：");
            String okPassword = sc.next();

            if (okPassword.equals(password)) {
                account.setPassword(okPassword);
                break;
            } else {
                System.out.println("两次密码不一致，请重新输入~~");
            }
        }

        System.out.println("请输入提取限额：");
        double quotaMoney = sc.nextDouble();
        account.setQuotaMoney(quotaMoney);

        String cardId = getRandomCardId(accounts);
        account.setCardId(cardId);

        accounts.add(account);
        System.out.println("恭喜您注册成功! 您的用户名是：" + userName + "，您的卡号是：" + cardId);
    }

    private static String getRandomCardId(ArrayList<Account> accounts) {
        Random rd = new Random();
        while (true) {
            String cardId = "";
            for (int i = 0; i < 8; i++) {
                cardId += rd.nextInt(10);
            }

            Account acc = getAccountByCardId(accounts, cardId);

            if (acc == null) {
                return cardId;
            }
        }
    }

    /**
     * 根据卡号查询出一个账户对象
     * @param accounts
     * @param cardId
     * @return 账户对象 | null
     */
    private static Account getAccountByCardId(ArrayList<Account> accounts, String cardId) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getCardId().equals(cardId)) {
                return accounts.get(i);
            }
        }

        return null;
    }
}
