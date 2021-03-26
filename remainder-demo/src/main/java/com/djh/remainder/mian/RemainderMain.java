package com.djh.remainder.mian;

import com.djh.remainder.utils.RemainderUtils;

/**
 * 剩下的主要
 *
 * @author MrMyHui
 * @date 2021/03/25
 */
public class RemainderMain {
    public static void main(String[] args) {
        int divisor = 16;
        int dividend = 12;
        System.out.println(String.format("数字%d与数字%d的取模结果是%d", divisor, dividend, RemainderUtils.moduloCalculation(divisor, dividend)));
    }
}
