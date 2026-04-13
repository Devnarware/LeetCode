class Solution {
    public int countDays(int days, int[][] meetings) {
        
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0])) ;

        List<int[]> list = new ArrayList<>() ;
        list.add(meetings[0]) ;

        for(int i = 1; i < meetings.length; i++){
            if(meetings[i][0] <= list.get(list.size() - 1)[1]){
                list.get(list.size() - 1)[0] = Math.min(
                    list.get(list.size() - 1)[0],
                    meetings[i][0] 
                ) ;
                list.get(list.size() - 1)[1] = Math.max(
                    list.get(list.size() - 1)[1],
                    meetings[i][1] 
                ) ;
            }
            else{
                list.add(meetings[i]) ;
            }
        } 

        int gap = 0 ; 

        for(int i = 1; i < list.size(); i++){
            gap += list.get(i)[0] - list.get(i - 1)[1] - 1;
        }

        gap += list.get(0)[0] - 1 ;
        gap += days - list.get(list.size() - 1)[1] ;


        return gap ;
    }
}