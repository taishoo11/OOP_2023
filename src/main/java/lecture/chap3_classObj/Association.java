package lecture.chap3_classObj;

// Java Program to illustrate the
// Concept of Association

// Importing required classes
import java.util.*; 

// Class 1
// Bank class
class Bank {
 
    // Attributes of bank
    private final String name;
     
    private Set<Employee> employees;
      
    // Constructor of this class
    Bank(String name)
    {
        // this keyword refers to current instance itself
        this.name = name;
    }
 
    // Method of Bank class
    public String getBankName()
    {
        // Returning name of bank
        return this.name;
    }
   
    public void setEmployees(Set<Employee> employees){
        this.employees = employees;
    }
    
    public Set<Employee> getEmployees(){
        return this.employees;
    }
}
 
// Class 2
// Employee class
class Employee 
{
    // Attributes of employee
    private final String name;
    
    // Employee name
    Employee(String name)
    {
        // This keyword refers to current instance itself
        this.name = name;
    }
 
    // Method of Employee class
    public String getEmployeeName()
    {
        // returning the name of employee
        return this.name;
    }
}
 
// Class 3
// Association between both the
// classes in main method
public class Association 
{ 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating objects of bank and Employee class
        Bank bank = new Bank("ICICI");
        Employee emp = new Employee("Ridhi");
 
        Set<Employee> employees = new HashSet<Employee>();
        employees.add(emp);
       
        bank.setEmployees(employees);
       
        System.out.println(bank.getEmployees()+" are belongs to bank "+ bank.getBankName());
    }
}