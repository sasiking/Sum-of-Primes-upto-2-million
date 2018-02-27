def pri(n):
    mysum=0
    for i in range(2,n+1):
        fac=0
        for j in range(2,int(i**0.5)+1):
            if i%j==0:
                fac +=1
                break
        if(fac==0):
            mysum +=i
    print("sum of Primes upto ",n," = ",mysum)

if __name__=='__main__':
    n = int(input("Enter any number:- "))
    pri(n)
