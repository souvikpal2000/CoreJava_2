package writer;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class UserBO {

	public static void writeFile(ArrayList<User> userList, BufferedWriter bw) throws Exception {
		//write your code here
		try {
			
			for(User u:userList)
			{ 
				String str = u.name+","+u.mobileNumber+","+u.username+","+u.password;
				bw.write(str);
				bw.newLine();
			}
			
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}