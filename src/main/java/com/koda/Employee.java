package com.koda;

import java.util.ArrayList;
import java.util.List;

public class Employee {
  private String employeeId;
  private String name;
  private double balance;

  public Employee(String employeeId, String name, double balance){
    if (employeeId == null || employeeId.isBlank()) {
      throw new IllegalArgumentException("Employee ID harus diisi!");
    }
    if (name == null || name.isBlank()) {
      throw new  IllegalArgumentException("Nama harus diisi!");
    }
    if (balance < 0) {
      throw new IllegalArgumentException("Balance wajib diisi!");
    }
    this.employeeId = employeeId;
    this.name = name;
    this.balance = balance;
  }

  public String getEmployeeId() {
    return employeeId;
  }
  public String getName() {
    return name;
  }
  public double getBalance() {
    return balance;
  }
}
