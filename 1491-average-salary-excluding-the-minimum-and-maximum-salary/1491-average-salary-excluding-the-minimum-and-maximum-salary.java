class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary); 

        double d = 0;

        for(int i=1;i<salary.length-1;i++){  
            d = d + salary[i];
        } 

        return  d / (salary.length-2); 

    }
}