package com.xworkz.teacher;

public class TeacherRunner {
    public static void main(String[] args) {
        TeacherImpl teacher = new TeacherImpl();

        teacher.teach();
        teacher.giveHomework();
        teacher.conductExam();

        System.out.println(Teacher.teacherName);
        System.out.println(Teacher.teacherId);
    }
}
