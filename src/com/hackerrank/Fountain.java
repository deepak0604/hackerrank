package com.hackerrank;

public class Fountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fountain.findSubString("aabb", "abc"));
	}
	
	
	/*
	public int repatedString(String source, String target) {
		
		char[] targetArray = target.toCharArray();
		char[] sourceArray = source.toCharArray();
		int sourceLength = source.length();
		int targetLength= target.length();
		if(sourceLength < targetLength ) {
			return -1;
		}
		
		int sa[] = new int[256];
		int ta[] = new int[256];
		
		for(int i=0; i < targetLength ; i ++) {
			ta[target.charAt(i)]++;
		}
	
		int start = 0;
		int start_index = -1;
		int min_len = Integer.MAX_VALUE;
		
		int count = 0;
		
		
		for(int i=0;i< sourceLength;i++) {
			
			sa[source.charAt(i)]++;
			
			if(ta[])
			for(int j=0;j < sourceLength;j++) {
				String s = null;
				if(i < j) {
					s = str
				}
			}
		}
		
	}*/
	
	static int findSubString(String source, String target) 
    { 
        int sourceLen = source.length(); 
        int targetLen = target.length(); 
        int finalLen = -1;
        
        if (sourceLen < targetLen) 
        { 
        	return finalLen;
        } 
      
        int targetArrayCount[] = new int[256]; 
        int sourceCharCount[] = new int[256]; 
       
        for (int i = 0; i < targetLen; i++) 
            targetArrayCount[target.charAt(i)]++; 
      
        int start = 0;	
        int index = -1;
        int min_len = Integer.MAX_VALUE; 
      
        int count = 0; 
        for (int j = 0; j < sourceLen ; j++) 
        { 
            sourceCharCount[source.charAt(j)]++; 
      
            if (targetArrayCount[source.charAt(j)] != 0 && 
                sourceCharCount[source.charAt(j)] <= targetArrayCount[source.charAt(j)] ) 
                count++; 
      
            if (count == targetLen) 
            { 
                while ( sourceCharCount[source.charAt(start)] > targetArrayCount[source.charAt(start)] 
                    || targetArrayCount[source.charAt(start)] == 0) 
                { 
      
                    if (sourceCharCount[source.charAt(start)] > targetArrayCount[source.charAt(start)]) 
                        sourceCharCount[source.charAt(start)]--; 
                    start++; 
                } 
      
                int length = j - start + 1; 
                if (min_len > length) 
                { 
                    min_len = length; 
                    index = start; 
                }
            } 
        } 
      
        if (index == -1) 
        { 
        	return finalLen;
        } 
        
      finalLen = source.substring(index, index + min_len).length();
        return finalLen; 
    } 

}