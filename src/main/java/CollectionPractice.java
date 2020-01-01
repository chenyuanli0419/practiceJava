import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionPractice {

    public static void listDemo(){
        int[] arr = new int[4];
        ArrayList<String> list=new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");

        Iterator it= list.iterator();
        while (it.hasNext()){
            System.out.println(it.hasNext());
            String str=(String) it.next();
            System.out.println(str);
            System.out.println("----------------");
        }
    }

    /*public static void setDemo(){
        TreeSet<> ts= new TreeSet();
        ts.add(new Person("lisi8", 21));
        ts.add(new Person("lisi3", 23));
        ts.add(new Person("lisi", 21));
        ts.add(new Person("lis0", 20));
        Iterator it = ts.iterator();

        while(it.hasNext()) {
            Person p = (Person)it.next();
            System.out.println(p.getName() + ":" + p.getAge());
    }*/

    public static void main(String[] args){
        listDemo();
        //setDemo();
    }
}

