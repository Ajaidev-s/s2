def sub(a,b):
    return a-b
def pattern(n,down):
    temp=sub(n,down)
    if down:
        print(temp,end=" ")
        pattern(n,sub(down,1))
        print(temp,end=" ")
        return
    print(n,end=" ")
n=int(input("enter the number"))
pattern(n,n)
