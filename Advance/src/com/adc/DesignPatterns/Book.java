package com.adc.DesignPatterns;

/**
4  * ��Bookʵ�������XML�ļ��е�"<book>...</book>"������Ԫ��
5  * ������<book>��ǩ��֤������Ҫ�洢�µ�bookʱ��Ҫ����Book����
6  */
public class Book {
     private String id;
     private String name;
     private String author;
     private String year;
     private String price;
     private String language;
     public String getId() {
      return id;
     }
     public void setId(String id) {
      this.id = id;
     }
     public String getName() {
      return name;
     }
     public void setName(String name) {
      this.name = name;
     }
     public String getAuthor() {
      return author;
     }
     public void setAuthor(String author) {
      this.author = author;
     }
     public String getYear() {
      return year;
     }
     public void setYear(String year) {
      this.year = year;
     }
     public String getPrice() {
      return price;
     }
     public void setPrice(String price) {
      this.price = price;
     }
     public String getLanguage() {
      return language;
     }
     public void setLanguage(String language) {
      this.language = language;
     }
 }