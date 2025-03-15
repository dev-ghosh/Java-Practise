package Strings;
public class Compression {
    public static void main(String[] args) {
        String str="aaabbbbccddde";
        String ans= "" + str.charAt(0); // one a will be always present
        int count=1;
        for(int i=1;i<str.length();i++){
            char curr=str.charAt(i);
            char prev=str.charAt(i-1);
            if(curr==prev) count++;
            else{
                 if(count>1) ans+=count; // 1 wont be printed
                count=1;
                ans+=curr;
            }
        }
        if(count>1) ans+=count;
        System.out.println(ans);
    }
}
