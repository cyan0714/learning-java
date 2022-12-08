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
                    login(accounts, sc);
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

    private static void login(ArrayList<Account> accounts, Scanner sc) {
        if (accounts.size() == 0) {
            System.out.println("对不起，当前系统无任何账号，请先开户~");
            return;
        }

        while (true) {
            System.out.println("请输入卡号");
            String cardId = sc.next();

            Account acc = getAccountByCardId(accounts, cardId);

            if (acc != null) {
                while (true) {
                    System.out.println("请输入密码");
                    String password = sc.next();
                    if (acc.getPassword().equals(password)) {
                        System.out.println(acc.getUserName() + "登录成功！");
                        showUserCommand(sc, acc);
                    } else {
                        System.out.println("密码错误");
                    }
                }
            } else {
                System.out.println("该卡号不存在于系统中~");
            }
        }


    }

    private static void showUserCommand(Scanner sc, Account acc) {
        while (true) {
            System.out.println("================用户操作页===============");
            System.out.println("1、查询账户");
            System.out.println("2、存款");
            System.out.println("3、取款");
            System.out.println("4、转账");
            System.out.println("5、修改密码");
            System.out.println("6、退出");
            System.out.println("7、注销账户");

            int command = sc.nextInt();

            switch(command) {
                case 1:
                    // 展示用户信息
                    showAccount(acc);
                    break;
                case 2:
                    // 存款
                    depositMoney(acc, sc);
                    break;
                case 3:
                    // 取款
                    drawMoney(acc, sc);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("退出成功，欢迎下次光临~");
                    return;
                case 7:
                    break;
                default:
                    System.out.println("您输入的命令不正确！");
            }
        }
    }

    private static void drawMoney(Account acc, Scanner sc) {
        if (acc.getMoney() < 100) {
            System.out.println("金额不足，请先存钱~");
            return;
        }

        double money = 0;
        while (true) {
            System.out.println("请输入取款金额");
            money = sc.nextDouble();

            if (money > acc.getQuotaMoney()) {
                System.out.println("取款值大于当次限额" + acc.getQuotaMoney() + "请重新输入~");
            } else if (acc.getMoney() < money) {
                System.out.println("存款不足，存点钱吧~");
            } else {
                break;
            }

        }

        acc.setMoney(acc.getMoney() - money);
        System.out.println("取款成功！");
        showAccount(acc);

    }

    private static void depositMoney(Account acc, Scanner sc) {
        System.out.println("请输入存款金额：");
        double money = sc.nextDouble();

        acc.setMoney(acc.getMoney() + money);
        System.out.println("存钱成功！账户信息如下：");
        showAccount(acc);
    }

    private static void showAccount(Account acc) {
        System.out.println("当前账户信息如下：");
        System.out.println("卡号：" + acc.getCardId());
        System.out.println("户主：" + acc.getUserName());
        System.out.println("余额：" + acc.getMoney());
        System.out.println("限额：" + acc.getQuotaMoney());
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
