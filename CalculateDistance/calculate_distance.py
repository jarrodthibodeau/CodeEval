import sys
import math
test_cases = open(sys.argv[1], 'r')
for test in test_cases:
	nums = []
	test = test.replace(',', '').replace('(', '').replace(')', '').split()
	for i in range(0,len(test)):
		nums.append(int(test[i]))
	print(int(math.sqrt((nums[0] - nums[2]) ** 2 + (nums[1] - nums[3]) ** 2)))

test_cases.close()