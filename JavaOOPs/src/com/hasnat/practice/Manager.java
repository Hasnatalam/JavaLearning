package com.hasnat.practice;
public class Manager 
{
   int managerId;
   String managerName;
   double managerSalary;
  
   public void setManagerData(int managerId, String managerName, double managerSalary)
   {
       this.managerId = managerId;
       this.managerName = managerName;
       this.managerSalary = managerSalary;
   }

   @Override
	public String toString() 
	{
		return "Manager [managerId=" + this.managerId + ", managerName=" + this.managerName + ", managerSalary=" + this.managerSalary
				+ "]";
	}  
  
}
