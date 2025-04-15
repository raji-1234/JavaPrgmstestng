package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Employee emp = new Employee();
		emp.name = "Rajeshwari";
		emp.salary = 100000;
		emp.empId = 100707;
		emp.displayData();
		System.out.println("==========================================");
		Employee emp1 = new Employee();
		emp1.name = "Deb";
		emp1.salary = 120000;
		emp1.empId = 100800;
		emp1.displayData();*/
		System.out.println("==========================================");
		Person per = new Person("Rajeshwari", 323231, 35, "Bagalkot");

		Person per1 = new Person("Deb", 31231, 25, "Kolkata");
		per.displayData();
		System.out.println(Person.country);
		System.out.println("==========================================");
		per1.displayData();
		System.out.println(Person.country);
		
		AccessModifierExample obj1 = new AccessModifierExample();
		obj1.name = "Chandra";
		obj1.rollNo = 100;
		obj1.grade = 5;
		
		obj1.setSchoolName("Oxford");
		System.out.println(obj1.getSchoolName());
		// Inheritance concept

				ChildClass chld1 = new ChildClass();
				chld1.phoneNo = 123456;
				chld1.name = "Deb";
				chld1.rollNo = 105;
				chld1.grade = 6;
				MethodOverloading mo = new MethodOverloading();
				//mo.Sum(10, 20);
				System.out.println(mo.Sum(10, 20));
				mo.Sum(10, 20, 30);
				
			//	Browser bo = new Browser();
				//ChromeBrowser co = new ChromeBrowser(); same as below
				Browser co = new ChromeBrowser();
				co.DispalyData();
				co.LaunchBrowser();
				co.OpenApplication("chrome");
				co.CloseBrowser();
				//FirefoxBrowser co = new ChromeBrowser(); same as below
				Browser fo = new Firefoxbrowser();
				fo.LaunchBrowser();
				fo.OpenApplication("ok");
				fo.CloseBrowser();
				
				Bank bb = new ICICIBank();
				bb.ShowBalance();//only overridden methods can be used
				bb.PrintStatement();
				
				
				ICICIBank ib = new ICICIBank();
				ib.ShowBalance();
				ib.PrintStatement();
				ib.OpenAccount();
				ib.CloseAccount();
	}

}
