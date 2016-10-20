mport edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.io.;
import java.util.;

public class Exercise3_1_19 {

    public static void main(String[] args) {
        int distinct = 0, words = 0;
        int minlen = Integer.parseInt(args[0]);
        ST<String, Integer> st = new ST<String, Integer>();

        // compute frequency counts
        while (!StdIn.isEmpty()) {
            String key = StdIn.readString();
            if (key.length() < minlen) continue;
            words++;
            if (st.contains(key)) { st.put(key, st.get(key) + 1); }
            else                  { st.put(key, 1); distinct++; }
        
        }
  
    ArrayList<Integer> values = new ArrayList<Integer>();
    values.addAll(st.values());

    Collections.sort(values, Collections.reverseOrder());

    int last_i = -1;


    for (Integer i : values.subList(0, 9)) { 
        if (last_i == i)
         continue;
        last_i = i;

for (String s : st.keySet()) { 

            if (st.get(s) == i)  
               System.out.println(s+ " " + i);            
        }
      }
       
        
   }
}
