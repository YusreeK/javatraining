package labs;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student("Yusree", "8407035162089");
		Student stu2 = new Student("Naifah", "1234567891011");
		Student stu3 = new Student("Qailah", "1110987654321");
		
		stu1.enroll("Math151");
		stu1.enroll("English255");
		stu1.enroll("His211");
		
		// stu1.showCourses();
		// stu1.checkBalance();
		stu1.payTuition(600);
		// stu1.checkBalance();
		System.out.println(stu1.toString());
		
	}

}

class Student {
	// Properties
	private static int iD=10;
	private String userId;
	private String name;
	private String IDN;
	private String email;
	private String phone;
	private String city;
	private String province;
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance=0;
	
	public Student(String name, String IDN) {
		iD++;
		this.name = name;
		this.IDN = IDN;
		setUserId();
		setEmail();
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	
	private void setEmail() {
		String email = name.toLowerCase() + "." + iD + "@gmail.com";
		System.out.println("Your email: " + email);
	}
	
	private void setUserId() {
		int max = 9000;
		int min = 1000;
		int randNum =  (int) (Math.random() * ((max - min)));
		randNum = randNum +min;
		userId = iD + "" + randNum + IDN.substring(1);
		System.out.println("Your user ID: " + userId);
	}
	
	public void enroll(String course) {
		this.courses = this.courses + "\n" + course;
		System.out.println(courses);
		balance = balance + costOfCourse;
		
	}
	
	public void payTuition(int amount) {
		System.out.println("Payment: $ " + amount);
		balance = balance - amount;
	}
	
	public void checkBalance() {
		System.out.println("Balance: $ " + balance);
	}
	
	public void showCourses() {
		System.out.println(courses);
	}
	
	public String toString() {
		return "[Name; " + name  + " ]\n[COURSES: " + courses + " ]\n[BALANCE: " + balance + "]";
	}
}