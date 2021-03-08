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
}
