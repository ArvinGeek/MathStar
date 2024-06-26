package com.adc.DesignPatterns;

/**
4  * 用Book实体类代表XML文件中的"<book>...</book>"中整个元素
5  * 在遇到<book>标签，证明我们要存储新的book时需要创建Book对象
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