/*
124 나라가 있습니다. 124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.

124 나라에는 자연수만 존재합니다.
124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.
예를 들어서 124 나라에서 사용하는 숫자는 다음과 같이 변환됩니다.

10진법	124 나라	10진법	124 나라
1	1	6	14
2	2	7	21
3	4	8	22
4	11	9	24
5	12	10	41
자연수 n이 매개변수로 주어질 때, n을 124 나라에서 사용하는 숫자로 바꾼 값을 return 하도록 solution 함수를 완성해 주세요.

제한사항
n은 500,000,000이하의 자연수 입니다.
*/

class Solution {
  public String solution(int n) {
      String answer = "";
      int[] world = {1, 2, 4};
      
      // n은 500,000,000이하의 자연수
      if(n > 0 && n < 500000000) {
         int quotient = 0;
         int remainder = 0;
         int arrLen = world.length;
          
          while(true) {
              if(n != 0) {
                  int idx;

                  quotient = n / arrLen;
                  remainder = n % arrLen;

                  idx = getIndex(remainder - 1, arrLen - 1);
                  answer = world[idx] + answer;

                  if(quotient > 0) {
                      if(remainder != 0) {
                          n = n / arrLen;
                      }
                      else {
                          n = n / arrLen - 1;
                     }
                  }
                  else {
                      break;
                  }
              }
              else {
                  break;
              }
          }
      }
      
      return answer;
  }

  // 순환 배열
  public int getIndex(int idx, int arrayLength) {
      int result = idx;
      
      if(result < 0) {
          result = arrayLength;
      }
      
      return result;
  }
}