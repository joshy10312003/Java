import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		User user = null;
		
		FileInputStream fileIn = new FileInputStream("D:\\Java Project\\Serialization\\userInfo.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		user = (User) in.readObject();
		fileIn.close();
		in.close();
		
		System.out.println(user.username);
		System.out.println(user.password);
		
	}

}
