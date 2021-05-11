package WordDictionary;

import java.util.HashMap;

public class WordDictionary {

	HashMap<String, String>words =new HashMap<String, String>();
	
	public void addWord(String english, String korean) {
		 words.put(english, korean);
	    }

	    public String find(String english) {
	    	String a=null;
	    	for(String key : words.keySet()) {
	    		if(english.toUpperCase().equals(key.toUpperCase())) {
	    			a = words.get(key);
	    		}
	    	}
	    	return a;
	    }
}
