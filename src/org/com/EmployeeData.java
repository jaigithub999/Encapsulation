package org.com;

public class EmployeeData {
	
//	1.instant variable 
	
	private int ssn;
	
	private String empName;
	
	private int empAge;
	

	
	public static void main(String[] args) {
		
		
		EmployeeData emp = new EmployeeData();
		emp.setSsn(1768725);
		emp.setEmpName("jayaselvam");
		emp.setEmpAge(27);
		System.out.println("Employee Name is: "+emp.getEmpName());
		System.out.println("Employee SSN Number:  "+ emp.getSsn());
		System.out.println("Employee Age:  "+emp.getEmpAge());
		
/*		
	}
//	2. set getter and setter
	
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	*/
	
}



	public int getSsn() {
		return ssn;
	}



	public void setSsn(int ssn) {
		this.ssn = ssn;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public int getEmpAge() {
		return empAge;
	}



	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
}

	/*public class  Employee {
		public static void main(String[] args) {
			EmployeeData emp1 = new EmployeeData();
			emp1.getEmpName();
			emp1.getEmpName();
			emp1.getSsn();
			
		}
		
	}*/