package com.shopmanagementsystem.spring.DTO;

public class DiscountedProductDTO {
  int id;
  String name;
  int discountAvailable;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getDiscountAvailable() {
    return discountAvailable;
  }

  public void setDiscountAvailable(int discountAvailable) {
    this.discountAvailable = discountAvailable;
  }
}
