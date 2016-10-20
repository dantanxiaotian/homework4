import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise3_1_9 {

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

        // find a key with the highest frequency count
        String max = "";
        st.put(max, 0);
        for (String word : st.keys()) {
            if (st.get(word) > st.get(max))
                max = word;
       String lastWord= st.subsring(st.lastIndexOf(“”)+1);
       
       int count=0;
       for(i=0;i<st.length;i++){
       cout++;
      }
       totalCount=count-1;
        }

        StdOut.println(max + " " + st.get(max));
        StdOut.println("distinct = " + distinct);
        StdOut.println("words  = " + words);
        StdOut.println(“ ” + lastWord);
        StdOut.println(“total number of words before last word inserted is :  ”+ totalCount);
    }
}
