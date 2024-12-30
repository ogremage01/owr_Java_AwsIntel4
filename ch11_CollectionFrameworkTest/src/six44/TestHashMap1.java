package six44;

import java.util.HashMap;
import java.util.Scanner;

public class TestHashMap1 {

   public static void main(String[] args) {

      HashMap<String, String> classMap = new HashMap<String, String>();
      
      classMap.put("201", "자바");
      classMap.put("202", "인공지능");
      classMap.put("203", "AWS");
      classMap.put("205", "AWS 우리반");
      
      String ourClass = "205";
      
      System.out.println(ourClass + " " + classMap.get("205"));
      
   }

}
