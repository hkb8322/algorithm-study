/*
 *
 */

def solution(a, b):
    answer = 0
    start = 0
    end = 0
    
    # 크기 비교 후 계산 범위 확정
    if a < b:
        start = a
        end = b
    else:
        start = b
        end = a

    # 반복문을 통한 합계 계산
    for i in range(start, end + 1):
        answer += i
    
    return answer
