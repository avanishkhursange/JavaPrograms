public class permutprac{
    static void perm(String str,String newstr){
        if(str.length()==0){
            System.out.println(newstr);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String per=str.substring(0,i)+str.substring(i+1);
            perm(per,newstr+ch);
        }
    }
    public static void main(String args[]){
        String s="abc";
        perm(s,"");
    }
}
