def solution(numbers):
    return max(sorted(numbers)[0] * sorted(numbers)[1], sorted(numbers)[len(numbers)-1] * sorted(numbers)[len(numbers)-2])
  