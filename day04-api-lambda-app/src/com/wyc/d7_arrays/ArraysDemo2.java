package com.wyc.d7_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayDemo2 {
    public static void main(String[] args) {
        // 1.Arrays.sort对于有值特性默认升序
        int[] ages = {32, 14, 31, 54, 31};
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

        // 2. 降序排序（自定义比较器对象，只能支持引用类型排序
        Integer[] ages1 = {32, 14, 31, 54, 31};
        /**
         * 待排数组，必须引用类型
         * 匿名内部类对象，代表比较器对象
         */
        Arrays.sort(ages1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1 - o2; // 默认升序
                return o2 - o1; // 默认降序
            }
        });
        System.out.println(Arrays.toString(ages1));

        System.out.println("---------------------");


        Student[] students = new Student[3];
        students[0] = new Student("王一川", 22, 158.5);
        students[1] = new Student("王二川", 27, 169.5);
        students[2] = new Student("王川", 29, 185.5);

        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 自己指定比较规则
//                return o1.getAge() - o2.getAge(); // 按照年龄升序
//                return o2.getAge() - o1.getAge(); // 按照年龄降序
                // 比较浮点型可以这么写
                return Double.compare(o1.getHeight(), o2.getHeight());
            }
        });
        System.out.println(Arrays.toString(students));
    }
}
