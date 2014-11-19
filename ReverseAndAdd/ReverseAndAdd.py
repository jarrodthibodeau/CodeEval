import sys

def reverse_number(num):
	return int(str(num)[::-1])
def palindrome(num):
	return str(num) == str(num)[::-1]


test_cases = open(sys.argv[1], 'r')
for test in test_cases:
	num = int(test)
	count = 0
	while count <= 100:
		if(palindrome(num)):
			print(str(count) + " " + str(num))
			break 
		else:
			num += reverse_number(num)
			count += 1





