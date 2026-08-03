import java.util.*;
class Main{
    public static void main(String[] ar){
        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(12,"Samsung");
        tm.put(11,"Pixel");
        tm.put(22,"IPhone");
        tm.put(23,"IQ");
        System.out.println(tm.get(22));
        System.out.println(tm.putIfAbsent(24,"VIVO"));
        System.out.println(tm);
        System.out.println(tm.replace(23,"OPPO"));
        System.out.println(tm);
        tm.replaceAll((key,value)->value.toUpperCase());
        System.out.println(tm);
        Iterator<Map.Entry<Integer,String>> entry=tm.entrySet().iterator();
        while(entry.hasNext()){
            Map.Entry<Integer,String> it=entry.next();
            System.out.println("Cart Id: "+it.getKey()+" Product Name: "+it.getValue());
        }
    }
}
