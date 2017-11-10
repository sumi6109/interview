import java.util.List;
import java.util.Objects;

public class Solution {
    // DO NOT MODFIY THE LIST.
    public int maxSubArray(final List<Integer> a) {
        int maxLen =0;
        int len =0;
        for(int i =0;i<a.size();i++){
            for(int j =i; j<a.size();j++){
                len += a.get(j);
                System.out.println(len);
                if(maxLen<len){
                    maxLen = len;
                }
            }
            len =0;
        }
        return maxLen;
    }
    public int repeatedNumber(final List<Integer> a) {
        for(int i = 0; i<a.size();i++){
            for(int j = i+1; j<a.size();j++){
                if(Objects.equals(a.get(i), a.get(j))){
                    return a.get(i);
                }
            }
        }
        return -1;
    }
    int printRepeating(List<Integer> a ) {
        int i = 0;
        int j = 0;
        do {
            i = a.get(i);//4
            j = a.get(a.get(j));//2
        } while(i != j);
        j = 0;
        while (i != j) {
            i = a.get(i);
            j = a.get(j);
        }
        return i;
    }
    }
