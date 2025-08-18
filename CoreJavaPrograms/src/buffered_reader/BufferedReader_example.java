package buffered_reader;

import java.io.*;

public class BufferedReader_example {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name:");
		String name=br.readLine();
		System.out.println("Enter the age:");
		int age=Integer.parseInt(br.readLine());
		System.out.println("Enter the salary:");
		double salary=Double.parseDouble(br.readLine());
		
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("Salary:"+salary);
		
		
	}
}