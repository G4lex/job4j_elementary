package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ганага Алексей Игоревич");
        student.setStudyGroup("101 ");
        student.setDate("01.09.2014.");
        System.out.println("ФИО : " + student.getFullName() + ", " + "дата зачисления : " + student.getDate() + "принят в группу : №" + student.getDate());
    }

}
