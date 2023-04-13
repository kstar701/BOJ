class Solution {
    public double solution(int[] numbers) {
        double a = 0;
        double answer = 0;
        for(int i=0;i<numbers.length;i++){
            a += numbers[i];
            answer = a/ numbers.length;
        }
        
        return answer;
    }
}