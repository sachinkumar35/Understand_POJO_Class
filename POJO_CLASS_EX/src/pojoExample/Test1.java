package pojoExample;

public class Test1 {

	public static void main(String[] args) {
		
		Student_Pojo s1 = new Student_Pojo();
		s1.setName("Mohit");
		s1.msg();
		s1.getName();
		
		Student_Pojo s2 = new Student_Pojo("sachin",220,20);
		s2.msg();
		s2.setName("Mohit");
		s2.getName();
		
	}

}
