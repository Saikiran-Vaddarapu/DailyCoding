class Duplicate{
    public static void main(String args[]){
        String s="appleaqqq";
        char[] ch=s.toCharArray();
        int[] ref=new int[26];
        for(int i=0;i<ch.length;i++){
              ref[ch[i]-97]++;
        }
        for(int i=0;i<ref.length;i++){
           if(ref[i]>1){
                System.out.println((char)(i+97));
            } 
            //System.out.println(ref[i]);
        }
    }
}