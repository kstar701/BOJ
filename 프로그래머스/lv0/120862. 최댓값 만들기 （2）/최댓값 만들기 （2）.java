import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        
        int number1 = numbers[0] * numbers[1];
        int number2 = numbers[numbers.length-1] * numbers[numbers.length-2];
        if(number1>number2)
            return number1;
        else
            return number2;
        
    }
}