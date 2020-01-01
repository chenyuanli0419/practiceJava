import java.util.*;

public class MapDemo {
    public MapDemo() {
    }

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap();
        method_2(map);
    }

    public static void method_2(Map<Integer, String> map) {
        map.put(8, "zhaoliu");
        map.put(2, "zhaoliu");
        map.put(7, "xiaoqiang");
        map.put(6, "wangcai");
        Collection<String> values = map.values();
        Iterator it2 = values.iterator();

        while(it2.hasNext()) {
            System.out.println((String)it2.next());
        }

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        Iterator it = entrySet.iterator();

        while(it.hasNext()) {
            Map.Entry<Integer, String> me = (Map.Entry)it.next();
            Integer key = (Integer)me.getKey();
            String value = (String)me.getValue();
            System.out.println(key + "::::" + value);
        }

    }

    public static void method(Map<Integer, String> map) {
        System.out.println((String)map.put(8, "wangcai"));
        System.out.println((String)map.put(8, "xiaoqiang"));
        map.put(2, "zhangsan");
        map.put(7, "zhaoliu");
        System.out.println("get:" + (String)map.get(6));
        System.out.println(map);

    }
}