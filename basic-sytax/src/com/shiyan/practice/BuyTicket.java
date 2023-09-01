package com.shiyan.practice;

public class BuyTicket {
    public static void main(String[] args) {
        System.out.println(calcPrice(100, 9, 1));
    }

//    用户购买机票时, 票价会按照淡季和旺季, 头等舱还是经济舱的情况进行相应的优惠, 优惠方案如下: 5-10月为旺季, 头等舱9折, 经济舱8.5折; 11-4月为淡季, 头等舱7折, 经济舱6.5折,
//    请编写程序计算出用户当前机票的优惠价
    public static double calcPrice(double price, int month, int type) {
        double resPrice = 0.0;

        if (month >= 5 && month <= 10) {
            switch (type) {
                case 1 -> resPrice = price * 0.9;
                case 2 -> resPrice = price * 0.85;
            }
        } else {
            switch (type) {
                case 1 -> resPrice = price * 0.7;
                case 2 -> resPrice = price * 0.65;
            }
        }

        return resPrice;
    }
}
