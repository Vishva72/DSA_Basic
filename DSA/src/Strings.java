public class Strings {
//    To check if String is Palindrome
    public boolean is_Palindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
//
    public int shortest_Path(String str){
        int x =0;
        int y =0;
        for(int i=0 ;i<str.length(); i++){
            char d = str.charAt(i);
            if(d == 'E'){
                x = x + 1;
            }
            else if(d == 'N'){
                y = y+1;
            } else if (d == 'W') {
                x = x-1;
            }else {
                y = y-1;
            }
        }
        int x1 = x*x;
        int y1 = y*y;
        return (int)Math.sqrt(x1+y1);
    }

    public String lexico_Largest(String...items){
        String largest = items[0];
        for(String str:items){
            if(str.compareTo(largest)<0){
                largest = str;
            }
        }
        return largest;
    }

}
