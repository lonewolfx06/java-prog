import java.util.*;
class StringCheck
{
    public static String sortString(String ipStr) {
        StringTokenizer st = new StringTokenizer(ipStr);
        int wordCount = st.countTokens();
        String strArr[] = new String[wordCount];
        
        for (int i = 0; i < wordCount; i++) {
            strArr[i] = st.nextToken();
        }
        
        for (int i = 0; i < wordCount - 1; i++) {
            for (int j = 0; j < wordCount - i - 1; j++) {
                if (strArr[j].length() > strArr[j + 1].length()) {
                    String t = strArr[j];
                    strArr[j] = strArr[j+1];
                    strArr[j+1] = t;
                }
                
                if (strArr[j].length() == strArr[j + 1].length()
                    &&(strArr[j].compareTo(strArr[j+1]) > 0))
                {
                    String t = strArr[j];
                    strArr[j] = strArr[j+1];
                    strArr[j+1] = t;
                }
            }
        }
        
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < wordCount; i++) {
            sb.append(strArr[i]);
            sb.append(" ");
        }
        
        /*
         * trim will remove the extra space added
         * to the end of the string in the loop above
         */
        return sb.toString().trim();
    }
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = in.nextLine();
        int len = str.length();
        System.out.println();
        
        if (str.charAt(len - 1) != '.' 
            && str.charAt(len - 1) != '?' 
            && str.charAt(len - 1) != '!') {
                System.out.println("INVALID INPUT");
                return;
        }
        
        /*
         * str.substring(0, len - 1) removes the   
         * '.', '?', '!' at the end of the string
         */
        String sortedStr = sortString(str.substring(0, len - 1));
        
        System.out.println(str);
        System.out.println(sortedStr);
    }
}
