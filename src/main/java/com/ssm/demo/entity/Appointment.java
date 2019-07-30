package com.ssm.demo.entity;

/**
 * 预约图书
 */
public class Appointment {

  private long studentId;
  private java.sql.Timestamp appointTime;
  private Book book;

  public long getStudentId() {
    return studentId;
  }

  public void setStudentId(long studentId) {
    this.studentId = studentId;
  }


  public java.sql.Timestamp getAppointTime() {
    return appointTime;
  }

  public void setAppointTime(java.sql.Timestamp appointTime) {
    this.appointTime = appointTime;
  }

  public Book getBook() {
    return book;
  }

  public void setBook(Book book) {
    this.book = book;
  }
}
