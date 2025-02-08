package com.example.JUnitTesting;

import java.util.List;

public class testcase {
    public static int bai1(int a, int b) {
        return a * b;
    }

    public static int bai2(int a, int b) {
        if (b == 0) throw new ArithmeticException("khong chia het cho 0");
        return a / b;
    }

    public static double bai3(List<Integer> numbers) {
        if (numbers.isEmpty()) throw new ArithmeticException("danh sach trong");
        return numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public static int getElementAtIndex(int[] arr, int index) {
        if (index < 0 || index >= arr.length) throw new IndexOutOfBoundsException("Index out of bounds");
        return arr[index];
    }



    class User {
        private String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
    public String getName(User user) {
        if (user == null) throw new NullPointerException("User la null");
        return user.getName();
    }

    public int PTNhoNhat(int[] array) {
        if (array.length == 0) throw new IllegalArgumentException("Mang trong");
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }


    public double average(int[] numbers) {
        if (numbers.length == 0) throw new ArithmeticException("Danh sach trong");
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }
}
