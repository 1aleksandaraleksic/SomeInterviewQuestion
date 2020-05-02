package task.task_three;

import java.util.ArrayList;

public class MainClass3 {

	public static void main(String[] args) {
		
		String name;
		
		ArrayList<String> array = new ArrayList<String>();
		
		name = "konj";
		
		array.add("njok");
		array.add("onjk");
		array.add("djon");
		array.add("mis");
		array.add("pas");
		array.add("noj");
		array.add("vo");
		array.add("meda");
		
		for(String s: array) {
			if(s.length() == name.length()) {	
				int machedChar =0;
				for(int i=0;i<name.length();i++) {
					for(int j=0;j<s.length();j++) {
						if(s.charAt(j)==name.charAt(i)) {
							machedChar++;
						}
					}
				}
				if(machedChar ==name.length()) {
					System.out.println(s);
				}
			}
		}

	}

}
