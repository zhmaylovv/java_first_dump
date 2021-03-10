import java.util.*;
public class Hash {
  public static void main(String[] args) {
     HashMap<String, String> hm = new HashMap();
       hm.put("Заря", "Солнце");
       hm.put("Приливы", "Луна");
       hm.put("Динозавры", "Астероид");
       hm.put("Атланты", "Геродот");

       System.out.println(hm);
       for (Map.Entry<String, String> entry : hm.entrySet()){
         String key = entry.getKey();
         String value = entry.getValue();
         System.out.println(key + ":" + value);
         }
 }
}
