package CORE_JAVA_WELCOM;
import java.io.BufferedReader;// importing lib
import java.io.IOException;
import java.io.InputStreamReader;

public class core_java_session3_assignment4 {
	int roll_no;
	String name;
	float marks;
	static String course="E&TC";
	//BufferedReader read_val;

	public core_java_session3_assignment4(int a)
	{
		roll_no=a;
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		core_java_session3_assignment4 student1= new core_java_session3_assignment4(121);
		core_java_session3_assignment4 student2= new core_java_session3_assignment4(122);
		core_java_session3_assignment4 student3= new core_java_session3_assignment4(123);
		
		System.out.println("Student 1 Name:");
		student1.name=br.readLine();
		
		System.out.println("Student 1 marks:");
		student1.marks=Float.parseFloat(br.readLine());
		
		System.out.println("Student 2 Name:");
		student2.name=br.readLine();
		
		System.out.println("Student 2 marks:");
		student2.marks=Float.parseFloat(br.readLine());
		
		System.out.println("Student 3 Name:");
		student3.name=br.readLine();
		
		System.out.println("Student 3 marks:");
		student3.marks=Float.parseFloat(br.readLine());
		
		System.out.println("Batch "+course+" 2016");
		System.out.println("Roll No:"+student1.roll_no+" \n"+"Student 1 Name:"+student1.name+" Marks:"+student1.marks);
		System.out.println("Roll No:"+student2.roll_no+" \n"+"Student 1 Name:"+student2.name+" Marks:"+student2.marks);
		System.out.println("Roll No:"+student3.roll_no+" \n"+"Student 1 Name:"+student3.name+" Marks:"+student3.marks);
	}

}
