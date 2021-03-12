package com.djh.math.binary.main;

import com.djh.math.binary.utils.LessonUtils;

import static com.djh.math.binary.utils.LessonUtils.decimalToBinary;

/**
 * 数学二元主要
 *
 * @author MyMrDiao
 * @date 2021/03/08
 */
public class MathBinaryMain {
    public static void main(String[] args) {
        int a = 3890;
        String b = "110101";

        /*int a = 106;
        String b = "1101010";*/
        // 获取十进制数53的二进制数
        System.out.println(String.format("数字%d的二进制是%s", a, decimalToBinary(a)));
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

        int numA = 53;
        int numB = 35;
        // 测试向左移位
        System.out.println(String.format("数字%d的二进制向左移%d位是%d", num, m, LessonUtils.leftShift(num, m)));
        // 测试向右移位
        System.out.println(String.format("数字%d的二进制向右移%d位是%d", num, m, LessonUtils.rightShift(num, m)));

        System.out.println("==================================================================");
        //获取十进制数53和35的按位“或”
        System.out.println(String.format("数字%d(%s)和数字%d(%s)的按位‘或’结果是%d(%s)", numA, decimalToBinary(numA), numB, decimalToBinary(numB), LessonUtils.or(numA, numB), decimalToBinary(LessonUtils.or(numA, numB))));

        //获取十进制数53和35的按位“与”
        System.out.println(String.format("数字%d(%s)和数字%d(%s)的按位‘与’结果是%d(%s)", numA, decimalToBinary(numA), numB, decimalToBinary(numB), LessonUtils.and(numA, numB), decimalToBinary(LessonUtils.and(numA, numB))));

        //获取十进制数53和35的按位“异或”
        System.out.println(String.format("数字%d(%s)和数字%d(%s)的按位‘异或’结果是%d(%s)", numA, decimalToBinary(numA), numA, decimalToBinary(numA), LessonUtils.xor(numA, numA), decimalToBinary(LessonUtils.xor(numA, numA))));
    }
}