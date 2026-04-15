class Solution {
    public int countDays(int days, int[][] meetings) {
        
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0])) ;    
        int maxEnd = meetings[0][1] ;
        int gap = 0 ;
        for(int i = 1; i < meetings.length; i++){
            if(meetings[i][0] > maxEnd){
                gap += meetings[i][0] - maxEnd -1 ;
            }
            maxEnd = Math.max(maxEnd, meetings[i][1]) ;
        }

        gap += meetings[0][0] + days - maxEnd - 1 ;

        return gap ;
    }
}