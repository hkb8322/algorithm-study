/*
 * https://programmers.co.kr/learn/courses/30/lessons/12916?language=python3
 */

def solution(s):
    answer = True
    iCnt_P = 0
    iCnt_Y = 0
    
    for cLetter in s:
        if cLetter.lower() == 'p':
            iCnt_P += 1
        elif cLetter.lower() == 'y':
            iCnt_Y += 1

    if iCnt_P != iCnt_Y:
        answer = False
    
    return answer
