class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> list = new ArrayList<Integer>() ;
        int colStart = 0 ;
        int colEnd = arr[0].length - 1  ;
        int rowStart = 0 ;
        int rowEnd = arr.length - 1 ;
        while(rowStart<=rowEnd && colStart<=colEnd){
            //  .........TOP ROW.......
            for(int i = colStart ; i<= colEnd; i++){
                list.add(arr[rowStart][i]) ;
            }
            //  .........RIGHT COL.......
            for(int i =rowStart+1  ; i<=rowEnd ; i++){
                list.add(arr[i][colEnd]) ;
            }
            if(rowStart<rowEnd && colStart<colEnd){
                //  .........BOTTOM ROW.......
            for(int i = colEnd-1 ; i>colStart; i--){
                list.add(arr[rowEnd][i]) ;
            }
            //  .........   LEFT COL.......
            for(int i = rowEnd ; i>= rowStart+1 ; i--){
                list.add(arr[i][colStart]) ;
            }
            }
            colStart++ ;
            rowStart++ ;
            colEnd--;
            rowEnd--;
        }
        return list ;
    }
}