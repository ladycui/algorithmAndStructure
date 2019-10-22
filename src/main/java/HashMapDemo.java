import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;

/**
 * @Auther: cyn
 * @Date: 2019-09-30 17:37
 * @Description:
 */
public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(5);
        map.put("one", "one");
        map.put("two", "two");
        map.put("three", "three");
        map.put("four", "four");
        map.put("five", "five");
        System.out.println(map.size());


        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println(entry.getKey().hashCode());
        }

        Map<String, String> lmap = new LinkedHashMap<>();
        lmap.put("one", "one");
        lmap.put("two", "two");
        lmap.put("three", "three");

        Iterator lIterator = lmap.entrySet().iterator();
        while (lIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) lIterator.next();
            System.out.println(entry.getKey());
        }


    }

}
