package com.spring.domain;

public class Account {
     private int id;
     private String name;
     private float money;

     public void setId(int id) {
          this.id = id;
     }

     public void setName(String name) {
          this.name = name;
     }

     public void setMoney(float money) {
          this.money = money;
     }

     public int getId() {
          return id;
     }

     public String getName() {
          return name;
     }

     public float getMoney() {
          return money;
     }

     @Override
     public String toString() {
          return "Account{" +
                  "id=" + id +
                  ", name='" + name + '\'' +
                  ", money=" + money +
                  '}';
     }
}
