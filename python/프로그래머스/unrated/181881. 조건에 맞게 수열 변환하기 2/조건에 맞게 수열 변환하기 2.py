def solution(arr):
    arr_prev = arr.copy()
    x = 0

    while True :
        for i in range(len(arr)):
            if arr[i] >= 50 and arr[i] % 2 == 0:
                arr[i] //= 2
            elif arr[i] < 50 and arr[i] % 2 == 1:
                arr[i] = arr[i] * 2 + 1
        if arr == arr_prev:
            break
        else:
            arr_prev = arr.copy()
            x += 1 

    return x