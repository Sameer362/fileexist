package devops;

import java.io.File;

public class fileExist {

	public static void main(String[] args) {
		
		File file=new File("C:\\APMOSYS WORKING DATA\\apmosys_devops\\destination\\mat.jar");
		if(file.exists()) {
			System.out.println("file exist");
		}
		else {
			System.out.println("file not exist");
		}

	}

}
