from decimal import Decimal 
def gcd(a,b):
    if b==0:
        return a
    else:
        return  gcd(b,a%b)

def getE(phiofn,n):
    
    for i in range(2,phiofn):
        if gcd(i,phiofn)==1:
            return i
    return 0
def getD(e,phiofn):
    for i in range(1,100):
        x=1+i*phiofn
        print(x)
        if x%e==0:
            return int(x/e)
    return 0
p=int(input("enter p:"))
q=int(input('enter q:'))

n=p*q

phiofn = (p-1)*(q-1)

e = getE(phiofn,n)
print('e=',e)
d= getD(e,phiofn)
print('d=',d)
P =int(input("enter equivalent number of plaintext: "))
C = Decimal(0)
C = pow(P,e)
C=C%n
print(C)
P=Decimal(0)
P=pow(C,d)
P=P%n
print(P)
