package assignment;

import java.util.*;

public class AlphaCount extends Thread {
	String line;
	int count = 0;
	Map<Character, Integer> mp = new LinkedHashMap<>();
	AlphaCount(String line){
		this.line = line;
	}
	public void setHashMap(char ch, int count) {
		mp.put(new Character(ch), new Integer(count));
	}
	public void run(){
        int length = line.length();
        int i,j;
        for(i=21;i<=122;i++){ 
        	j=0;
        	count = 0;
            while(j<length){
                char ch = line.charAt(j);
                if(ch==(char)i){
                    count = count + 1;
                }                
                j++;
            }
            if(count>0) {
            	setHashMap((char)i, count);
            }
        }
    }
}
