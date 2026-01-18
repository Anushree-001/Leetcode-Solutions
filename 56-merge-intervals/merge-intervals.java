import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
       if(intervals.length<=1){
        return intervals;
       } 
       Arrays.sort(intervals,(a,b)->a[0]-b[0]);
       int start=intervals[0][0];
       int end=intervals[0][1];

       List<int[]> result=new ArrayList<>();

       for(int i=1;i<intervals.length;i++){
        int currStart=intervals[i][0];
        int currEnd=intervals[i][1];

        if(currStart<=end){//overlap
        end=Math.max(end,currEnd);
        }
        else{
           result.add(new int[] {start,end});
           start=currStart;
           end=currEnd; 
        }
       }
       result.add(new int[]{start,end});

       return result.toArray(new int[result.size()][]);
    }
}