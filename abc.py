# n=int(input())
# li=[]
# #taking input and append it on a list
# for i in range(n): 
#     linput=list(map(str,input()))
#     li.append(linput)

# up=0
# count=0
# for sl in li: 
#   #checking C present or not in list
#     if 'C' in sl[1:-1]:
#         up=up+sl[1:-1].count('C') 
#     elif sl[0]=='C' and sl[-1]=='C':
#       	#checking list last and first value
#         count+=2
#     elif sl[-1]=='C' or sl[-1]=='C':
#       	#checking list last value
#         count+=1
# #checking count is odd or even
# if count%2==0: 
#     print(up+(count//2),count//2)
# else:
#     print(up+(count//2),(count//2)+1)


   
# cons=[0]
# def isSafe_or_Not(i,j,v,g):
#     return (i>=0 and j>=0 and i<len(g) and j<len(g[0]) and not v[i][j] and g[i][j]=='C')
# def DFS_Check(i,j,v,g,c):
#     rowone=[-1,0,1,0]
#     colone=[0,1,0,-1]
#     v[i][j]=True
#     cons[c]+=1
#     for ki in range(4):
#         #checking is safe or not
#         if isSafe_or_Not(i+rowone[ki],j+colone[ki],v,g):
#             DFS_Check(i+rowone[ki],j+colone[ki],v,g,c)

# def ci(g,n,m):
#     #list of list
#     vlist=[[False for j in range(m)]for i in range(n)]
#     count=0
#     for i in range(n):
#         for j in range(m):
#             #checking if false and c if true it will call dfs check function  
#             if vlist[i][j]==False and g[i][j]=='C':
#                 DFS_Check(i,j,vlist,g,count)
#                 #increase count by one and append 0 into cons list
#                 count+=1
#                 cons.append(0)
#     #sort cons list            
#     cons.sort(reverse=True)
#     scount1=0
#     scount2=0
#     #according to index make count
#     for i in range(len(cons)-1):
#         if i%2==0:
#             #for even count
#             scount1+=cons[i]
#         else:
#             #for odd count
#             scount2+=cons[i]
   
#     print(scount1,scount2,end="")
# n=int(input())
# glist=[]
# for i in range(n):
#     glist.append(input())
# ci(glist,n,n)    



# rinput,cinput=map(int,input().split())
# alist=[]
# for i in range(rinput):
#     #append all the values in alist
#     alist.append(input())
# blist=[]
# for i in range(cinput):
#     s=''
#     #appending alist values into blist
#     for j in alist[::-1]:
#         s+=j[i]
#     blist.append(s)
    
# for i in range(cinput):
#     #checking C present in blist
#     if 'C' in blist[i]:
#         blist[i]=blist[i][::-1]
# ans=0
# res=0
# for i in blist:
#     if 'C' in i:
#         #findinf C and update ans variable  and update res count
#         ans+=rinput-i.find('C')-1
#         res+=i.count('C')
#     else:
#         for j in range(rinput):
#             #chcking if true then update ans  and break this loop
#             if i[j]=='0':
#                 ans+=j
#                 break
# print(res,ans*2,end='')


# def code_here(n):
#     #filling list with true
#     primelist = [True for i in range(n+1)]
#     p = 2
#     #checking square of p if less or equal
#     while (p * p <= n):
#         #if primelist is true then update primelist value 
#         if (primelist[p] == True):
#             for i in range(p * p, n+1, p):
#                 primelist[i] = False
#         p += 1
#     return primelist
# def check_Code(f,p1,p2,primelist):
#     for i in range(p1,p2+1):
#         for j in range(i+1,p2+1):
#             #checking primelise is true or false
#             if primelist[i] or primelist[j]:
#                 if f<=0:
#                     print(i,j,end='')
#                     return
#             else:
#                 if (i*j)/((j-i)**2)>=f:
#                     print(i,j,end='')
#                     return
#     #for no pair it will print none
#     print("None",end='')
# finput,pinput1,pinput2=map(int,input().split())
# primelist=code_here(pinput2)
# check_Code(finput,pinput1,pinput2,primelist)


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
