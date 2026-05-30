public class Reverse {
    public static void main(String[] args) {
        String original = "I love Java";
        
       
        String[] words = original.split(" ");
        StringBuilder sb = new StringBuilder();
    
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            
          
            if (i > 0) {
                sb.append(" ");
            }
        }
        
        String reversedWords = sb.toString();
        System.out.println(reversedWords);
    }
}
