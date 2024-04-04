import java.util.HashMap;

 class All_Method_Calling {

    public static void main(String[] args) {
        String s1 = "Hello World";

        HashMap<String, Integer> wordCountMap = new HashMap<>();

        
        String[] words = s1.split("\\s+");

               for (String word : words) {
            if (wordCountMap.containsKey(word)) {
               
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                
                wordCountMap.put(word, 1);
            }
        }

       
        for (String word : wordCountMap.keySet()) {
            System.out.println("Word: " + word + ", Count: " + wordCountMap.get(word));
        }
    }
}