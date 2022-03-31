import javax.swing.tree.TreeNode;
import java.net.Inet4Address;
import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String nearestPalindromic(String n) {
        int length = (n.length() - 1) / 2; //前半部分长度为length
        String half = n.substring(0, length + 1);
        StringBuilder sb = new StringBuilder();
        if(half.length() % 2 == 0){
            sb = new StringBuilder(sb.substring(0, half.length()));
        }else{
            sb = new StringBuilder(sb.substring(0, half.length() - 1));
        }
        sb.reverse();
        String compareBig = sb.toString();
        StringBuilder bignum = new StringBuilder(half);
        bignum.append(sb);

        half = n.substring(0, length + 1);
        String minus1 = minus(half);
        StringBuilder smallnum = new StringBuilder();
        if(smallnum.length() % 2 == 0){
            smallnum = new StringBuilder(minus1.substring(0, smallnum.length()));
        }else{
            smallnum = new StringBuilder(minus1.substring(0, smallnum.length() - 1));
        }
        minus1 += smallnum.reverse().toString();

        long diffbig = Long.valueOf(compareBig) - Long.valueOf(n.substring(n.length() - compareBig.length(),n.length()));
        long smalldiff = 
        
        
    }

    public String minus(String num){
        StringBuilder ret = new StringBuilder();
        int tuiwei = 0;
        for(int index = num.length() - 1; index >= 0; index--){
            int temp = num.charAt(index) - '0' + tuiwei;
            if(temp < 0){
                temp = 0;
                tuiwei = -1;
            }else{
                tuiwei = 0;
            }
            ret.append(temp);
        }
        if(ret.charAt(ret.length() - 1) == '0'){
            ret.deleteCharAt(ret.length() - 1);
        }
        return ret.toString();
    }
}