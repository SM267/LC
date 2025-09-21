import java.util.*;
public class PalindromeString {
    public boolean pal(String s)
    {
        int left=0,right=s.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(left<right && Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
public static void main(String [] args)
{
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    PalindromeString ss=new PalindromeString();
    System.out.println(ss.pal(s)?"Yes a Palindrome":"Not a Palindrome");
}
}