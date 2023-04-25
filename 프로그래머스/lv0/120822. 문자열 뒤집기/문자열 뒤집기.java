class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] a = my_string.toCharArray();
        char[] b = new char[a.length];
        for(int i=0;i<a.length;i++){
            b[i] = a[a.length-i-1];
        }
        answer = new String(b);
        return answer;
    }
}