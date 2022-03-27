n =int(input())
#count fonction
def countTotal(n, s):
  #filling array with i index  
  ar=[i for i in range(1,n + 1)]
  #filling array with 0;
  co= [0 for i in range(s + 1)]
  co [0] = 1
 
  for i in range(1, s + 1): 
    for j in range(n):
      #checking array value
      if (i >= ar[j]):
        co[i]+= co[i - ar[j]]
  return co[s]


for i in range(n):
  a, b = map(int, input().split())
  #calling function
  count = countTotal(b, a)
  #print value
  print(count)