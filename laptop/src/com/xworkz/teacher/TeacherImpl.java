package com.xworkz.teacher;

public class TeacherImpl implements  Teacher{
    public void teach() {
        System.out.println("Teacher is teaching");
    }

    public void giveHomework() {
        System.out.println("Homework given");
    }

    public void conductExam() {
        System.out.println("Exam conducted");
    }
}
