package com.practice.project.entity;

import java.io.Serializable;

public class AcademicInfo implements Serializable {
    private int AcademicID;
    private String Qualification;
    private float Percentage;
    private int Year_of_passing;
    private String Board;
    private int StudentID;

    public AcademicInfo() {
    }

    public AcademicInfo(int academicID, String qualification, float percentage, int year_of_passing, String board, int studentID) {
        AcademicID = academicID;
        Qualification = qualification;
        Percentage = percentage;
        Year_of_passing = year_of_passing;
        Board = board;
        StudentID = studentID;
    }


    public int getAcademicID() {
        return AcademicID;
    }

    public void setAcademicID(int academicID) {
        AcademicID = academicID;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }

    public float getPercentage() {
        return Percentage;
    }

    public void setPercentage(float percentage) {
        Percentage = percentage;
    }

    public int getYear_of_passing() {
        return Year_of_passing;
    }

    public void setYear_of_passing(int year_of_passing) {
        Year_of_passing = year_of_passing;
    }

    public String getBoard() {
        return Board;
    }

    public void setBoard(String board) {
        Board = board;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    @Override
    public String toString() {
        return "AcademicInfo{" +
                "AcademicID=" + AcademicID +
                ", Qualification='" + Qualification + '\'' +
                ", Percentage=" + Percentage +
                ", Year_of_passing=" + Year_of_passing +
                ", Board='" + Board + '\'' +
                ", StudentID=" + StudentID +
                '}';
    }
}
