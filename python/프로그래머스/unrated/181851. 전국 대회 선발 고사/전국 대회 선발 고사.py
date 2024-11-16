def solution(rank, attendance):

	selected = []
	for i, attend in enumerate(attendance):
		if attend:
			selected.append((rank[i], i))
	
	selected.sort()
	print(selected)

	a, b, c = selected[:3]

	return 10000 * a[1] + 100 * b[1] + c[1]
