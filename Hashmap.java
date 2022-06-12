import java.util.HashMap;
class Hashmap{
    public static void main(String args[]){
        HashMap<Integer,String> m=new HashMap<Integer,String>();
        m.put(1,"MVSR");
        m.put(2,"CVR");
        System.out.println(m);
        m.put(3,"GRRR");
        m.put(4,"MGIT");
        System.out.println(m+" "+m.size()+"  "+m.get(1));
        //implementing traversals ,keyset() is used to get values ,if values are needed use values()
        for(int i:m.keySet())
        System.out.println(i+" -> "+m.get(i));
    }
}