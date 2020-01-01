import java.util.*;

public class MapPractice {

    public static void method(Map<Integer,String> map){
        map.put(2,"zhangsan");
        map.put(4,"李四");
        Collection values = map.values();
        Iterator it1 = values.iterator();

        while (it1.hasNext()){
            System.out.println((String) it1.next());
        }


        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        Iterator it2 = entrySet.iterator();

        while (it2.hasNext()){
            Map.Entry<Integer,String> me = (Map.Entry) it2.next();
            Integer key = me.getKey();
            String value = me.getValue();
            System.out.println(key+"---"+value);

        }

    }


    public static void main(String[] args){
        Map<Integer,String> map= new HashMap<Integer, String>();
        method(map);

    }
}
