package pojoExample;

public class Test1 {

	public static void main(String[] args) {
		
		Student_Pojo s1 = new Student_Pojo();
		s1.setName("Mohit");
		s1.setAge(21);
		s1.setId(221);		
		System.out.println("Name : "+s1.getName()+ "\nID : "+s1.getId()+"\nAge : "+ s1.getAge());
		
		s1.msg();
		
		Student_Pojo s2 = new Student_Pojo("sachin",220,20);
		s2.msg();
		System.out.println(s2.getName());
		
		
	}

}
