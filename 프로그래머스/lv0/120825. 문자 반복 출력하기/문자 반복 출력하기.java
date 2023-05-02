class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] a = new String[my_string.length()];
        a = my_string.split("");
        for(int i=0; i<my_string.length();i++){
            answer += a[i].repeat(n);
        }
        return answer;
    }
}