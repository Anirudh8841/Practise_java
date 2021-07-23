
// class TestObject{


// }
import java.util.*;
// import static org.apache.commons.lang.ArrayUtils;
// import java.util.stream.*;
// import com.google.common.collect.ImmutableMap; 
 
class Main{
    public static boolean isZro(double x) {
        return x==0;
    }
    public static Map<Integer,double[]> func(boolean b){
        Map<Integer,double[]> fmap = null;
        double[] first = new double[10];
        if(b){
            // double[] first = new double[10];
            for (int i = 0; i < first.length; i++) {
                first[i] = i;
            }
            fmap.computeIfAbsent(1, o -> first);
            double[] second = first;
            second[1] = 9;
        }
        else {
            // double[] first = new double[10];
            for (int i = 0; i < first.length; i++) {
                first[i] = i;
            }
            fmap.computeIfAbsent(1, o -> first);
            double[] second = first;
            second[1] = -9;
        }
        return fmap;
    }
    public static void main(String args[]){

        int[] first = new int[2];
        int[] second = new int[2];
        double[][] check1 = new double[0][];
        double[] check2 = new double[0];

        Map<String, String> map1 = new HashMap<>();
        map1.put("firstName", "anirudh");
        map1.put("secName", "khammampati");

        final String printString = "Hi " + map1 + " end";
        
        System.out.println(printString);

        // adding to test reset this line
        // if (first == first) {
        //     System.out.println("== working fine");
        // }
        
        // if (Arrays.equals(first, second)) {
        //     System.out.println("equals working fine");
        // }
        // System.out.println(String.class.getClassLoader());
  
        // // Test class is loaded by Application loader
        // System.out.println(Main.class.getClassLoader());
        // System.out.println(Runtime.getRuntime().freeMemory());
        // System.out.println(ArrayUtils.isEmpty(check1));
        // System.out.println(check2.length);

        // if (first[3] == 0 || first.length < 3  ) {
        //     System.out.println("ok "+ first.length);  

        // }
        // Map<String, String> map1 = new HashMap<>();
        // map1.put("a","ok-1");
        // map1.put("b","ok-2");
        // Map<String, Map<String,String>> map2 = new HashMap<>();
        // map2.put("m1", map1);
        // ImmutableMap<String, Map<String,String>> map3 = ImmutableMap.copyOf(map2);

        // Set<String> set1 = new HashSet<>(map3.get("m1").keySet());
        // // map3.get("m1").keySet();
        // // set1.addAll(map3.get("m1").keySet());
        // set1.remove("a");
        // System.out.println("hi "+ first.length);  
        // System.out.println("bye "+ map3.get("m1").size());  
        // System.out.println("bye "+ map2.get("m1").size());
        // System.out.println("bye "+ map1.get("a"));    
        // 2 exits or not 

        // boolean ans = arr!=null && arr.contains(2); 
  
        // arr.forEach(a -> 
        //     System.out.println("ani")
        // );
        // if (arr==null) 
        // else
        //     System.out.println("The list does not contains 2");
        
        // // func();
        // double[] arr = new double[2];
        // arr[1] =0.6;
        // IntStream.of(arr).anyMatch(x -> x==0);
        // double[] second = new double[1];
        // SortedMap<Integer,double[]> fmap1 = new TreeMap<>();
        // SortedMap<Integer,double[]> fmap2 = new TreeMap<>();
        
        // for (int i = 0; i < first.length; i++) {
        //     first[i] = 1;
        // }
        // for (int i = 0; i < first.length; i++) {
        //     second[i] = 2;
        // }
        // fmap1.put(1,first);
        // fmap1.put(2,second);
        // // double[] third = new double[1];
        // fmap1.forEach((x,arr) -> {
        //     double[] third = new double[1];
        //     for (int i = 0; i < arr.length; i++) {
        //         third[i] = arr[i];
        //     }
        //     fmap2.put(x, third);
        // });


        // System.out.println("k "+ (s1.length()>2 && s1.substring(s1.length()-2).equals("BD")) );

        // System.out.println("fmap1-1  "+arr1.get(0));
        // System.out.println("fmap1-2  "+fmap1.get(2)[0]);
        // System.out.println("fmap2-1  "+fmap2.get(1)[0]);
        // System.out.println("fmap2-1  "+fmap2.get(2)[0]);
        // double[] second = first;
        // second[0] = 9;
        // System.out.println("fmap2  "+fmap.get(1)[0]);
        // double[] third = new double[10];
        // third = second;
        // third[0] = 8;
        // fmap.put(1,third);
        // System.out.println("fmap2  "+fmap.get(1)[0]);
        // // System.out.println("fmap  "+fmap.get(1));
        // System.out.println("Value  "+third[0]+" "+second[0]+" "+first[0]);
        //     String s = null;
        //     String s1 = "a";
        //     boolean b = s==null || s.length() ==1;
        // System.out.println("fmap  "+b);


        // System.out.println("Ani".indexOf("A", 1));
        // System.out.println("Ani".indexOf("n", 0));
        // System.out.println("Ani".indexOf("i"));

    }
}