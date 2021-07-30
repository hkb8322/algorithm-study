/*
 * https://programmers.co.kr/learn/courses/30/lessons/12903?language=python3
 */

def solution(s):
    answer = ''
    str_length = len(s)
    str_half_length = str_length // 2
    
    if(str_length % 2 == 0):
        #짝수인 경우
        answer = s[(str_half_length - 1):(str_half_length + 1)]
    else:
        #홀수인 경우
        answer = s[str_half_length]
    
    return answer
