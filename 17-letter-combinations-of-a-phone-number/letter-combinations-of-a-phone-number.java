class Solution {
    public List<String> letterCombinations(String digits) {
        return keypadList(digits , "") ;
    }

    public static ArrayList<String> keypadList(String str , String ans  ){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>() ;
            list.add(ans) ;
            return list ;
        }
        int digit = str.charAt(0) - '0' ;
        ArrayList<String> list = new ArrayList<>() ;
        if (digit == 7){
            for (int i = (digit-2)*3; i < ((digit-1)*3) + 1 ; i++) {
                list.addAll(keypadList(str.substring(1) , ans + (char)('a' + i))) ;
            }
        }
        else if(digit == 8){
            for (int i = ((digit-2)*3) + 1; i < ((digit-1)*3) + 1; i++) {
                list.addAll(keypadList(str.substring(1) , ans + (char)('a' + i))) ;
            }
        }
        else if(digit == 9){
            for (int i = ((digit-2)*3) + 1; i < ((digit-1)*3) + 2 ; i++) {
                list.addAll(keypadList(str.substring(1) , ans + (char)('a' + i))) ;
            }
        }
        else{
            for (int i = (digit-2)*3; i < ((digit-1)*3) ; i++) {
                list.addAll(keypadList(str.substring(1) , ans + (char)('a' + i))) ;
            }
        }
        return list ;
    }
}