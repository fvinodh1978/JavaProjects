package com.ibm.java;
//abstract class can implements a interface
//Abstract class can implements multiple interface

abstract class Salary {
    public abstract int bonus(); //abstract method which will be implemented within the sub class 
    public int calcSalary(int DA, int HRA, int Tax) {
        return (HRA + DA) - Tax;
    }
}
//inheriting the abstract class
class ProjectLead extends Salary {
  public int bonus() { //implementation of abstract method
      return 10000 + 5000 + 2500;
  }
}
//inheriting the abstract class
class TeamLead extends Salary {
  public int bonus() {
      return 7000 + 5000;
  }    
}

public class AbstractDemo {
    public static void main(String[] args) {
    	int $a;
    	int &b;
    	int switch;
    	
        ProjectLead obj = new ProjectLead();
        int netsalary = obj.calcSalary(20000, 30000, 5000) + obj.bonus();
        System.out.println("Project Lead Total Salary: " + netsalary);
        TeamLead obj1 = new TeamLead();
        netsalary = obj1.calcSalary(15000, 20000, 3000) + obj1.bonus();
        System.out.println("Team Lead Total Salary: " + netsalary);
    }
}



