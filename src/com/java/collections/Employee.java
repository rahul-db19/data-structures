package com.java.collections;

import java.util.LinkedHashSet;

public class Employee {
    public String empCode;
    public String empName;
    public long empSalary;

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public long getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(long empSalary) {
        this.empSalary = empSalary;
    }

    public EmployeeSave getEmployeeSave() {
        return employeeSave;
    }

    public void setEmployeeSave(EmployeeSave employeeSave) {
        this.employeeSave = employeeSave;
    }

    EmployeeSave employeeSave = new EmployeeSave();

}

