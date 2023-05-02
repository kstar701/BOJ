class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=10; i++){
            if(n >= fac(i)){
                answer = i;
            }
            else{
                break;
            }
        }
        return answer;
    }
    public int fac(int number){
        if(number>1)
            
            return number * fac(number-1);
        return number;
        
    }
}