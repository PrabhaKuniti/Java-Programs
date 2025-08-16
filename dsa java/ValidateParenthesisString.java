class ValidateParenthesisString{
    static boolean checkValidString(String s){
        int lo=0,hi=0;
        for(char c:s.toCharArray()){
            if(c=='('){lo++;hi++;}
            else if(c==')'){lo=Math.max(0,lo-1);hi--;if(hi<0)return false;}
            else{lo=Math.max(0,lo-1);hi++;}
        }
        return lo==0;
    }
    public static void main(String[] args){
        System.out.println(checkValidString("(*)"));
    }
}
