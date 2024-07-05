class Solution {
    public String sortVowels(String s) {
        List<Character> vowel = new ArrayList<>();
        List<Character> small = new ArrayList<>(); 
        String st = ""; 
        for(int i=0;i<s.length();i++){ 
            if(s.charAt(i)=='A' || s.charAt(i)=='a' || s.charAt(i)=='E' || s.charAt(i)=='I'  || s.charAt(i)=='O' ||  s.charAt(i)=='U'){ 
                vowel.add(s.charAt(i));  
                s = s.substring(0,i)+'*'+s.substring(i+1);
            }  
            else if( s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u'){ 
                small.add(s.charAt(i)); 
                s = s.substring(0,i)+'*'+s.substring(i+1);
        } 
        }  
        Collections.sort(vowel);  
        Collections.sort(small);
        int j = 0,k=0;
        for(int i=0;i<s.length() & j<vowel.size();i++){ 
            if(s.charAt(i)=='*'){ 
               s = s.substring(0,i)+vowel.get(j++)+s.substring(i+1);
            }
        } 
         for(int i=0;i<s.length() & k<small.size();i++){ 
            if(s.charAt(i)=='*'){ 
                 s = s.substring(0,i)+small.get(k++)+s.substring(i+1);
            }
        } 
    
        return s;
    }
}