import heapq

def solution(scoville, K):
    answer = []
    
    heapq.heapify(scoville)
    mix_count = 0
    
    while scoville[0] < K :
        if len(scoville) < 2:
            return -1
        
        least_spicy = heapq.heappop(scoville)
        second_least_spicy = heapq.heappop(scoville)
        
        new_scoville = least_spicy + (second_least_spicy * 2)
        heapq.heappush(scoville, new_scoville)

        mix_count += 1

    return mix_count
