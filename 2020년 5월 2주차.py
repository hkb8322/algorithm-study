/*
 * https://programmers.co.kr/learn/courses/30/lessons/42586
 */

def solution(progresses, speeds):
    answer = []
    finish_day = []
    tmp_day = 1
    
    for i in range(len(progresses)):
        finish_day.append((100 - progresses[i]) // speeds[i])
    
    compare_day = finish_day[0]
    
    for i in range(1, len(finish_day)):
        if compare_day >= finish_day[i]:
            tmp_day += 1
        else:
            answer.append(tmp_day)
            compare_day = finish_day[i]
            tmp_day = 1
        
        if i == (len(finish_day) - 1):
            answer.append(tmp_day)

    return answer
