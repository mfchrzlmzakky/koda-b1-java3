package com.koda;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class App 
{
    public static void main( String[] args )
    {
      // LIST
      List<Employee> employees = new ArrayList<>();
      employees.add(new Employee("KR001", "Andi", 7000000));
      employees.add(new Employee("KR002", "Budi", 5000000));
      employees.add(new Employee("KR003", "Citra", 6000000));
      System.out.println("EMPLOYEE LIST \n");
      for (Employee employee : employees) {
        System.out.println(employee.getEmployeeId() + " - " + employee.getName() + " - " + employee.getBalance());
      }

      // SET
      Set<Employee> employees = new HashSet<>();
      employees.add(new Employee("KR001", "Andi", 7000000));
      employees.add(new Employee("KR002", "Budi", 5000000));
      employees.add(new Employee("KR003", "Citra", 6000000));
      System.out.println("EMPLOYEE LIST \n");
      for (Employee employee : employees) {
        System.out.println(employee.getEmployeeId() + " - " + employee.getName() + " - " + employee.getBalance());
      }

      // MAP
      Map<String, Employee> employeeMap = new LinkedHashMap<>();
      for (Employee employee : employees) {
        employeeMap.put(employee.getEmployeeId(), employee);
      }
      Employee selectedEmployee = employeeMap.get("KR001");
      if (selectedEmployee != null) {
        System.out.println(selectedEmployee.getEmployeeId() + " - " + selectedEmployee.getName() + " - " + selectedEmployee.getBalance());
      }
      Employee selectedEmployee2 = employeeMap.get("KR002");
      if (selectedEmployee2 != null) {
        System.out.println(selectedEmployee2.getEmployeeId() + " - " + selectedEmployee2.getName() + " - " + selectedEmployee2.getBalance());
      }
      Employee selectedEmployee3 = employeeMap.get("KR003");
      if (selectedEmployee3 != null) {
        System.out.println(selectedEmployee3.getEmployeeId() + " - " + selectedEmployee3.getName() + " - " + selectedEmployee3.getBalance());
      }
      for (int i = 0; i < employees.size(); i++) {
        System.out.println(employee.getEmployeeId() + " - " + employee.getName() + " - " + employee.getBalance());
      }

      // QUEUE
      Queue<String> employees = new ArrayDeque<>();
      employees.offer("Andi");
      employees.offer("Budi");
      employees.offer("Citra");
      System.out.println("EMPLOYEE LIST \n");
      for (int i = 0; i <= employees.size()+1; i++) {
      // for (Employee employee : employees) {
        // System.out.println(employee.getEmployeeId().poll() + " - " + employee.getName() + " - " + employee.getBalance());
        System.out.println(employees.poll());
      // }
      }
    }
}
