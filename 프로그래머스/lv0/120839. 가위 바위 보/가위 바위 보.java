class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] strArr = rsp.split("");
        for(int i = 0; i < strArr.length; i++) {
            if(strArr[i].equals("2")) answer += "0";
            else if(strArr[i].equals("0")) answer += "5";
            else if(strArr[i].equals("5")) answer += "2";
        }
        return answer;
    }
}