package pojoExample;

public class Student_Pojo {   // 1.class must be public

	private String name; 	  // 2. variable must be private
	private int id;
	private int age;
	

	public Student_Pojo() {   		// 3. must having public default constructor
		// default constructor
		
	}
	
	
	public Student_Pojo(String name, int id, int age) {      // 4. can have arguments constructor
		
		this.name = name;
		this.id = id;
		this.age = age;
	}

	
// 5. every property/field/variable have public getter and setter method...
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}

	public void msg() {
		System.out.println(name+" "+id+" "+age);
	}
	

}
