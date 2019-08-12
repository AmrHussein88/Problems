
public class StringRepeat {

	static long repeatedString(String s, long n) {
//		if(s.equals("a"))
//			return n;
//		
//		System.out.println("String length is : "+s.length());
//		StringBuilder sb = new StringBuilder();
//		while(sb.length()<n) {
//			if(sb.length()+s.length() >n) {
//				int to = (int)n-sb.length();
//				sb.append(s.substring(0,to));
//				break;
//			}
//			sb.append(s);
//			System.out.println("sb length is : "+sb.length());
//		}
//		char[] c = sb.toString().toCharArray();
//		long count = 0;
//		for(int i = 0; i<c.length ;i++) {
//			if(c[i] == 'a') count++;
//		}
//return count;
		int strLength = s.length();
        long aOccurrence = 0;
        long factor = n / strLength;
        System.out.println(10/6);
        System.out.println(10%6);
        System.out.println(9%6);
        System.out.println(6%5);
        long remainder = n % strLength;
        for (int i=0; i < strLength; i++) {
            if (s.charAt(i) == 'a') {
                aOccurrence += (i < remainder) ? factor + 1 : factor;
            }
        }
        return aOccurrence;
		    }
	public static void main(String[] args) {
System.out.print(repeatedString("abaaaa", 10));
	}

}
