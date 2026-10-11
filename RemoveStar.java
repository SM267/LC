import java.util.*;

class RemoveStar{
        public String rs(String s) {
            StringBuilder sb=new StringBuilder();
            int i=0;
            while(i<s.length()){
                if(s.charAt(i)== '*'){
                    if(sb.length()>0){
                        sb.deleteCharAt(sb.length()-1);
                    }
                }
                else{
                    sb.append(s.charAt(i));
                }
                i++;
            }
            return sb.toString();
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        RemoveStar r=new RemoveStar();
        System.out.println(r.rs(str));
    }
}