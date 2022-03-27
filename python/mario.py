rinput,cinput=map(int,input().split())
alist=[]
for i in range(rinput):
    #append all the values in alist
    alist.append(input())
blist=[]
for i in range(cinput):
    s=''
    #appending alist values into blist
    for j in alist[::-1]:
        s+=j[i]
    blist.append(s)
    
for i in range(cinput):
    #checking C present in blist
    if 'C' in blist[i]:
        blist[i]=blist[i][::-1]
ans=0
res=0
for i in blist:
    if 'C' in i:
        #finding C and update ans variable  and update res count
        ans+=rinput-i.find('C')-1
        res+=i.count('C')
    else:
        for j in range(rinput):
            #chcking if true then update ans  and break this loop
            if i[j]=='0':
                ans+=j
                break
print(res,ans*2,end='')