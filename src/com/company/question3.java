package com.company;

/*
2022/6/8
30min
b1g9uys
 */
public class question3 {
    public static void main(String[] args) {
        String queString = "dvdfabb";
        int answer = lengthOfLongestSubstring(queString);
        System.out.println(answer);
    }

    public static int lengthOfLongestSubstring(String s) {

        if(s.length()==0){
            return 0;
        }

        if(s.length()==1){
            return 1;
        }
        int i=0,j=1;
        int maxLen=1;

        while(j<s.length()){
            for(int tmp=i;tmp<j;tmp++){
                //判断滑动窗口内是否有重复字符
                if(s.charAt(tmp)==s.charAt(j)){
                    //存在重复字符 i移至重复字符后
                    i=tmp+1;
                }
            }

            if(j-i+1>maxLen){
                maxLen=j-i+1;
            }

            j++;
        }
        return maxLen;
    }
}
