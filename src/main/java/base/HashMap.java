package base;

import java.util.Map;

/**
 * HashMap HashMap学习
 *
 * @author hhuzzz
 * @version 2024/08/05 23:34
 */
public class HashMap {
    public static void main(String[] args) {
        // 创建一个HashMap来存储学生的成绩
        Map<String, Integer> studentGrades = new java.util.HashMap<>();

        // 向HashMap中添加一些数据
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 92);
        studentGrades.put("Charlie", 78);
        studentGrades.put("David", 90);

        // 打印所有学生的成绩
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + "'s grade: " + entry.getValue());
        }

        // 查询某个特定学生的成绩
        String student = "Bob";
        if (studentGrades.containsKey(student)) {
            System.out.println(student + "'s grade: " + studentGrades.get(student));
        } else {
            System.out.println("Grade for " + student + " not found.");
        }

        // 更新某个学生的成绩
        studentGrades.put("Alice", 88);
        System.out.println("Alice's updated grade: " + studentGrades.get("Alice"));

        // 删除某个学生的成绩
        studentGrades.remove("Charlie");
        System.out.println("Charlie's grade removed.");

        // 打印删除后的所有学生成绩
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + "'s grade: " + entry.getValue());
        }
    }
}