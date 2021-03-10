package com.djh.math.binary.main;

import com.djh.math.binary.utils.LessonUtils;

/**
 * 数学二元主要
 *
 * @author MyMrDiao
 * @date 2021/03/08
 */
public class MathBinaryMain {
    public static void main(String[] args) {
        int a = 53;
        String b = "110101";

        /*int a = 106;
        String b = "1101010";*/
        // 获取十进制数53的二进制数
        System.out.println(String.format("数字%d的二进制是%s", a, LessonUtils.decimalToBinary(a)));
        // 获取二进制数110101的十进制数
        System.out.println(String.format("数字%s的十进制是%d", b, LessonUtils.binaryToDecimal(b)));

        System.out.println("==================================================================");

        int num = 53;
        int m = 1;
        // 测试向左移位
        System.out.println(String.format("数字%d的二进制向左移%d位是%d", num, m, LessonUtils.leftShift(num, m)));
        // 测试向右移位
        System.out.println(String.format("数字%d的二进制向右移%d位是%d", num, m, LessonUtils.rightShift(num, m)));

        System.out.println("==================================================================");

        m = 3;

        // 测试向左移位
        System.out.println(String.format("数字%d的二进制向左移%d位是%d", num, m, LessonUtils.leftShift(num, m)));
        // 测试向右移位
        System.out.println(String.format("数字%d的二进制向右移%d位是%d", num, m, LessonUtils.rightShift(num, m)));
    }
}
