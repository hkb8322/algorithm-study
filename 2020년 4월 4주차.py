/*
 * https://programmers.co.kr/learn/courses/30/lessons/42748
 */

def solution(array, commands):
    answer = []
    
    for item in commands:
        tmpArr = array[item[0] - 1 :item[1]]
        tmpArr.sort()
        answer.append(tmpArr[item[2] - 1])
    
    return answer
