package chapter1;

public class chapter01_2 {
	String s(String folder, String file) {
		if(!folder.endsWith("¥")) {
			folder += "¥";
		}
		return folder + file;
	}
}
