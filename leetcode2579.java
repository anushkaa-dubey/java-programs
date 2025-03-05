//2579. Count Total Number of Colored Cells
//first solution :
/*class Solution {
    public long coloredCells(int n) {
        int sum=1;
        if(n==1){
            return 1;
        }
        else{
            for(int i=1;i<n;i++){
                sum=sum +(4*i);    //this program will fail when there is a large number , as The int type in Java has a maximum value of 2^31 -1
            }
            return sum;
        }
    }
}*/
//Optimized Solution
class Solution {
    public long coloredCells(int n) {
        return (long) n * n + (long) (n - 1) * (n - 1);
    }
}
