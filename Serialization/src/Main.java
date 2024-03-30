

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		User user = new User();
		
		user.username = "bro";
		user.password = "josh1031";
		
		FileOutputStream fos = new FileOutputStream("userInfo.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(user); 
		fos.close(); 
		oos.close();
		
		System.out.println("Info Saved");
	}
}
