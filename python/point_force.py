#taking input
array_input = [int(x) for x in input().split()]
# store first 3 value
mini_Force = array_input[0]
number1 = array_input[1]
number2 = array_input[2]


def checkPrime(numsin):
    #checking prime or not
    if numsin > 1:
        #this is prime checking code
        for j in range(2, int(numsin ** 0.5) + 1):
            
            if (numsin % j) == 0:
                return False
        else:
            return True
    else:
        return False


def Solve(num_1, num_2):
    #checking both two number is zero or not
    if num_1 == 0 or num_2 == 0:
        return 0
    #checking both two number is prime  or not
    if checkPrime(num_1) or checkPrime(num_2):
        return 0
    return (num_1 * num_2) / ((num_2 - num_1) ** 2)


def Code_Solution(nums1, nums2):
    for i1 in range(nums1, nums2 + 1):
        for i2 in range(nums1, nums2 + 1):
            #checking number is same or not , if not then we will get force value and return it
            if i1 != i2:
                getforce = Solve(i1, i2)
                getforce = int(getforce)
                if getforce >= mini_Force:
                    return [i1, i2]


#getting the answer
final_ans = Code_Solution(number1, number2)

#if no pair then print None
if final_ans is None:
    print(None, end="")
else:
    print(final_ans[0], final_ans[1], end="")