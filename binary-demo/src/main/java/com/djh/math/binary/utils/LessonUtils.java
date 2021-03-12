package com.djh.math.binary.utils;

import java.math.BigInteger;

/**
 * 教训跑龙套
 *
 * @author MyMrDiao
 * @date 2021/03/08
 */
public class LessonUtils {

    /**
     * 十进制转换为二进制
     *
     * @param decimalSource 十进制源
     * @return {@link String}
     */
    public static String decimalToBinary (int decimalSource) {
        // 转换成BigInteger类型，默认是十进制
        BigInteger bigInteger = new BigInteger(String.valueOf(decimalSource));
        // 参数2指定的是转化成二进制
        return bigInteger.toString(2);
    }

    /**
     * 二进制转换为十进制
     *
     * @param binarySource 二进制源
     * @return int
     */
    public static int binaryToDecimal (String binarySource) {
        // 转换为BigInteger类型，参数2指定的是二进制
        BigInteger bigInteger = new BigInteger(binarySource, 2);
        // 默认转换成十进制
        return Integer.parseInt(bigInteger.toString());
    }

    /**
     * 位运算左移
     *
     * @param num 等待左移的十进制数
     * @param m   向左移动的位数
     * @return int
     */
    public static int leftShift (int num, int m) {
        return num << m;
    }

    /**
     * 位运算右移
     *
     * @param num 等待右移的十进制数
     * @param m   向右移动的位数
     * @return int
     */
    public static int rightShift (int num, int m) {
        return num >>> m;
    }

    /**
     * 二进制按位”或“的操作
     *
     * @param num1 第一个数字
     * @param num2 第二个数字
     * @return int 二进制按位”或“的结果
     */
    public static int or (int num1, int num2) {
        return (num1 | num2);
    }

    /**
     * 二进制按位“与”的操作
     *
     * @param num1 第一个数字
     * @param num2 第二个数字
     * @return int 二进制按位”与“的结果
     */
    public static int and (int num1, int num2) {
        return (num1 & num2);
    }

    /**
     * 二进制按位“异或”的操作
     *
     * @param num1 第一个数字
     * @param num2 第二个数字
     * @return int 二进制按位”与“的结果
     */
    public static int xor (int num1, int num2) {
        return (num1 ^ num2);
    }
}
