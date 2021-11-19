import matplotlib.pyplot as plt

def Prime(a):
    c=0
    for i in range(1,a+1):
        if a%i==0:
            c=c+1

    if c==2:
        return 1
    else:
        return 0

def Consec(a, b):
    if b-a == 2 or a-b == 2:
        return 1
    else:
        return 0


low=int(input("Enter the Lower Bound:"))
up=int(input("Enter the Upper Bound:"))
List1=list()
List2=list()
ListM=list()
y=list()
countList=list()

num1=0
num2=0
checkP1=0
checkP2=0
count=0
freq=0

for x in range (low,up+1):
    num1=x
    num2=x+2
    checkConsec=Consec(num1,num2)

    if checkConsec == 1:
        freq = 0
        checkP1=Prime(num1)
        checkP2=Prime(num2)
        if checkP1 == 1 and checkP2 == 1:
            freq = freq + 1
            List1.append(num1)
            List2.append(num2)
            countList.append(freq)
            print(num1,",",num2)
            count=count+1


print("Total Twin Primes between",low,"and",up,":",count)

ListM=List1+List2
sortedListM=sorted(ListM)
# del sortedListM[1]
print(sortedListM)



# Paste the graph off of google



# for x in range (0,count*2):
#     y.append(x)
#
# x=sortedListM  # containing all the twin primes
# print(countList)

# y=[2,2,1,0,1,1,0,1,0,1]
#
# plt.xticks(x)
#
# plt.xlabel('X-AXIS')
# plt.ylabel('Y-AXIS')
#
# plt.scatter(x,y)
#
# plt.show()
