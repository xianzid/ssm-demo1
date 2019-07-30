package com.ssm.demo.entity;

/**
 * 图书
 */
public class Book {

  private long bookId;
  private String name;
  private long number;


  public long getBookId() {
    return bookId;
  }

  public void setBookId(long bookId) {
    this.bookId = bookId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }

  @Override
  public String toString() {
    return "Book{" +
            "bookId=" + bookId +
            ", name='" + name + '\'' +
            ", number=" + number +
            '}';
  }
}
