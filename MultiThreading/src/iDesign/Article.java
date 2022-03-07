package iDesign;

public class Article extends Thread {
	private static int count = 0;
	private String line;
	
	Article(){}
	Article(String line){
		this.line = line;
	}
	public int getCount() {
		return count;
	}
	public void run() {
		int length;
		line = line + ' ';
		length = line.length();
		int i = 0;
		String word="";
		while(i<length) {
			char ch = line.charAt(i);
			if(ch == ' ') {
				if(word.equalsIgnoreCase("a") || word.equalsIgnoreCase("an") || word.equalsIgnoreCase("the")) {
					count = count + 1;
				}
				word = "";
			}else {
				word = word + ch;
			}
			i++;
		}
	}
}
