package com.shiyan.movie.run;

import com.shiyan.movie.bean.Business;
import com.shiyan.movie.bean.Customer;
import com.shiyan.movie.bean.Movie;
import com.shiyan.movie.bean.User;

import java.util.*;

public class MovieSystem {
    //    存储所有用户(客户 商家)
    public static final List<User> ALL_USERS = new ArrayList<>();

    //    存储全部商家和其排片信息
    public static final Map<Business, List<Movie>> ALL_MOVIES = new HashMap<>();

    public static final Scanner SYS_SC = new Scanner(System.in);

    public static User loginUser = null;
    //    测试数据
    static {
        Customer c = new Customer();
        c.setLoginName("zhuyuanzhang");
        c.setPassword("1");
        c.setUserName("朱元璋");
        c.setSex('男');
        c.setMoney(10000);
        c.setPhone("11");
        ALL_USERS.add(c);


        Customer c1 = new Customer();
        c1.setLoginName("zhudi");
        c1.setPassword("2");
        c1.setUserName("朱棣");
        c1.setSex('男');
        c1.setMoney(20000);
        c1.setPhone("22");
        ALL_USERS.add(c1);

        Business b = new Business();
        b.setLoginName("wangyangming");
        b.setPassword("3");
        b.setUserName("王阳明");
        b.setSex('男');
        b.setMoney(30000);
        b.setPhone("33");
        b.setAddress("浙江");
        b.setShopName("知行合一影城");
        ALL_USERS.add(b);
        List<Movie> movies = new ArrayList<>();
        ALL_MOVIES.put(b, movies);

        Business b1 = new Business();
        b1.setLoginName("hairui");
        b1.setPassword("4");
        b1.setUserName("海瑞");
        b1.setSex('男');
        b1.setMoney(40000);
        b1.setPhone("44");
        b1.setAddress("海南");
        b1.setShopName("清正廉洁影城");
        ALL_USERS.add(b1);
        List<Movie> movies1 = new ArrayList<>();
        ALL_MOVIES.put(b1, movies1);
    }


    public static void main(String[] args) {
        Scanner SYS_SC = new Scanner(System.in);
        System.out.println("===世晏电影首页===");
        System.out.println("1. 登录");
        System.out.println("2. 用户注册");
        System.out.println("3. 商家注册");
        System.out.println("请输入操作命令:");
        String command = SYS_SC.nextLine();

        switch (command) {
            case "1":
                login();
                break;
            case "2":
                break;
            case "3":
                break;
        }

    }

    private static void login() {
        while (true) {
            System.out.println("请输入登录名称:");
            String loginName = SYS_SC.nextLine();
            System.out.println("请输入登录密码:");
            String password = SYS_SC.nextLine();

            User u = getUserByLoginName(loginName);
            loginUser = u;

            if (u != null) {
                if (u.getPassword().equals(password)) {
                    if (u instanceof Customer) {
                        showCustomerMain();
                    } else {
                        showBusinessMain();
                    }
                    return;
                } else {
                    System.out.println("密码错误!");
                }
            } else {
                System.out.println("暂无此用户,请确认!");
            }
        }
    }

    private static User getUserByLoginName(String loginName) {
        for (User user : ALL_USERS) {
            if (user.getLoginName().equals(loginName)) {
                return user;
            }
        }

        return null;
    }

    private static void showBusinessMain() {
        System.out.println("===世晏电影商家界面===");
        System.out.println(loginUser.getUserName() + (loginUser.getSex() == '男' ? "先生" : "女士" + "欢迎您进入系统"));
        System.out.println("1. 展示详情:");
        System.out.println("2. 上架电影:");
        System.out.println("3. 下架电影:");
        System.out.println("4. 修改电影:");
        System.out.println("5. 退出");
        System.out.println("请输入您要操作的命令:");

        String command = SYS_SC.nextLine();
        switch (command) {
            case "1":
                // 展示全部排片信息
                showBusinessInfo();
                break;
            case "2":
                // 上架电影信息
                break;
            case "3":
                // 下架电影信息
                break;
            case "4":
                // 修改电影信息
                break;
            case "5":
                // 干掉方法
                return;
            default:
                System.out.println("不存在该命令!");
                break;

        }
    }

    /**
     * 展示商家的详细信息(当前商家)
     */
    private static void showBusinessInfo() {
    }

    private static void showCustomerMain() {
    }
}
