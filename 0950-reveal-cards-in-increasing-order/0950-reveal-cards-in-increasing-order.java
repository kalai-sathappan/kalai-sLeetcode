class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        ArrayList<Integer> l = new ArrayList<>();

Arrays.sort(deck); // Sort the array
for (int i = 0; i < deck.length / 2; i++) {
    int temp = deck[i];
    deck[i] = deck[deck.length - i - 1];
    deck[deck.length - i - 1] = temp;
}

        for(int i=0;i<deck.length;i++) 
        {  
            l.add(0,deck[i]); 
            if(l.size()<deck.length){  
                int f = l.get(l.size()-1); 
                l.remove(l.size()-1);
                l.add(0,f);
            } 
           
        } 

        int a [] = new int[l.size()]; 

        for(int i=0;i<l.size();i++){ 
            a[i] = l.get(i);
        }
        return a;
    }
}