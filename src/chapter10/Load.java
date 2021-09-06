package chapter10;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Load {
	public static void main(String[] args) throws Exception {
		Employee employee = new Employee();
		employee.name = "田中太郎";
		employee.age = 41;
		Department department = new Department();
		department.name = "総務部";
		department.leader = employee;
		FileOutputStream fos = new FileOutputStream("c:¥¥company.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(department);
		oos.flush();
		oos.close();
	}
}
