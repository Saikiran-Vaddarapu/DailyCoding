class LongPalinSubStr
{
    public static boolean isPalin(String k){
        String temp=new StringBuilder(k).reverse().toString();
        if(temp.equals(k))
        return true;
        else
        return false;
    }
    public static void main(String args[]){
        String s="abbad";
        int l=s.length();
        if(s==null || s.length()==1 || s.isEmpty()){
            System.out.println("Ans : "+s);
            return;
        } 
        String ans=null;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                String x=s.substring(i,j+1);
                boolean h=isPalin(x);
                int k=x.length();
                if(h && k>max){
                    ans=x;
                    max=k;
                }
            }
        }
        System.out.println("Ans : "+ans);
    }
}