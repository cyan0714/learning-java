package com.shiyan.shopcar;

import java.util.Scanner;

public class ShopCar {
    public static void main(String[] args) {
        Goods[] shopCar = new Goods[100];
        while (true) {
            System.out.println("请选择如下命令操作：");
            System.out.println("添加：add");
            System.out.println("查询：query");
            System.out.println("修改：update");
            System.out.println("结算：query");

            Scanner sc = new Scanner(System.in);
            System.out.println("请您输入命令：");

            String command = sc.next();

            switch (command) {
                case "add":
                    addGoods(shopCar, sc);
                    break;
                case "query":
                    queryGoods(shopCar);
                    break;
                case "update":
                    updateGoods(shopCar, sc);
                    break;
                case "pay":
                    pay(shopCar);
                    break;
                default:
                    System.out.println("没有该功能哦~");
            }
        }
    }

    public static void pay(Goods[] shopCar) {
        queryGoods(shopCar);
        double money = 0;
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if  (g != null) {
                money += (g.price * g.buyNumber);
            } else {
                break;
            }
        }

        System.out.println("总金额为：" + money);
    }

    public static void updateGoods(Goods[] shopCar, Scanner sc) {
        while (true) {
            System.out.println("请输入要修改的商品的 id：");
            int id = sc.nextInt();
            Goods g = getGoodsById(shopCar, id);

            if (g == null) {
                System.out.println("对不起，没有购买商品！");
            } else {
                System.out.println("请输入商品" + g.name + "的购买数量：");
                int buyNumber = sc.nextInt();
                g.buyNumber = buyNumber;
                System.out.println("修改完成！");
                queryGoods(shopCar);
                break;
            }
        }
    }

    public static  Goods getGoodsById(Goods[] shopCar, int id) {
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null && g.id == id) {
                return g;
            } else {
                return null;
            }
        }

        // 遍历完发现所有商品的 id 和查询的 id 不一致，返回 null
        return null;
    }

    public static void queryGoods(Goods[] shopCar) {
        System.out.println("查询购物车信息如下：");
        System.out.println("编号\t\t名称\t\t\t价格\t\t\t购买数量");
        for (int i = 0; i < shopCar.length; i++) {
           Goods g = shopCar[i];
           if (shopCar[i] != null)  {
               System.out.println(g.id + "\t\t" + g.name + "\t\t\t" + g.price + "\t\t\t" + g.buyNumber);
           } else {
               break;
           }
        }
    }

    public static void addGoods(Goods[] shopCar, Scanner sc) {
        System.out.println("请输入购买商品的编号（不重复）：");
        int id = sc.nextInt();
        System.out.println("请输入购买商品的名称：");
        String name = sc.next();
        System.out.println("请输入购买商品的数量：");
        int buyNumber = sc.nextInt();
        System.out.println("请输入购买商品的价格：");
        double price = sc.nextDouble();

        Goods g = new Goods();
        g.id = id;
        g.name = name;
        g.buyNumber = buyNumber;
        g.price = price;

        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] == null) {
                shopCar[i] = g;
                break;
            }
        }

        System.out.println("商品" + g.name + "成功添加到购物车！");

    }
}
