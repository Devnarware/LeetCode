class Solution {
    public int[][] intervalIntersection(int[][] a, int[][] b) {
        
        List<int[]> list = new ArrayList<>() ;

        int i = 0 ,
           j = 0 ;

        while(i < a.length && j < b.length){
            int s1 = a[i][0],
                s2 = b[j][0],
                e1 = a[i][1],
                e2 = b[j][1] ;
        
            if(e1>=s2 && e2>=s1){
                list.add(new int[]{
                    Math.max(s1, s2), 
                    Math.min(e1, e2)
                }) ;
            }

            if(e1>e2){
                j++ ;
            }else if(e2 > e1){
                i++ ;
            }else{
                i++ ;
                j++ ;
            }
        }

        

        return list.toArray(new int[list.size()][2]) ;
    }
}