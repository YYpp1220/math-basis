package com.djh.remainder.utils;

/**
 * 余数与哈希工具类
 *
 * @author MrMyHui
 * @date 2021/03/13
 */
public class RemainderUtils {

    /**
     * 模的计算
     *
     * @param divisor  除数
     * @param dividend 被除数
     * @return int 返回余数
     */
    public static int moduloCalculation (int divisor, int dividend) {
        return divisor - dividend * (divisor / dividend);
    }
}
