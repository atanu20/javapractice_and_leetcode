cons=[0]
#function for checking safe or not
def isSafe_or_Not(i,j,v,g):
    return (i>=0 and j>=0 and i<len(g) and j<len(g[0]) and not v[i][j] and g[i][j]=='C')
def DFS_Check(i,j,v,g,c):
  	#creating some demo list for checking is safe or not
    rowone=[-1,0,1,0]
    colone=[0,1,0,-1]
    v[i][j]=True
    cons[c]+=1
    for ki in range(4):
        #checking is safe or not
        if isSafe_or_Not(i+rowone[ki],j+colone[ki],v,g):
            DFS_Check(i+rowone[ki],j+colone[ki],v,g,c)

def codehere(g,n,m):
    #list of list
    vlist=[[False for j in range(m)]for i in range(n)]
    count=0
    for i in range(n):
        for j in range(m):
            #checking if false and c if true it will call dfs check function  
            if vlist[i][j]==False and g[i][j]=='C':
                DFS_Check(i,j,vlist,g,count)
                #increase count by one and append 0 into cons list
                count+=1
                cons.append(0)
    #sort cons list            
    cons.sort(reverse=True)
    scount1=0
    scount2=0
    #according to index make count
    for i in range(len(cons)-1):
        if i%2==0:
            #for even count
            scount1+=cons[i]
        else:
            #for odd count
            scount2+=cons[i]
   
    print(scount1,scount2,end="")
n=int(input())
glist=[]
for i in range(n):
    glist.append(input())
codehere(glist,n,n)