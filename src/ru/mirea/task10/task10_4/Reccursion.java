package ru.mirea.task10.task10_4;
public class Reccursion {
    public int rec(int k, int s) {
        int a=(int) Math.pow(10,k-1);
        int b=(int) Math.pow(10,k)-1;
        if (b>=s){
            b=s;
        }
        System.out.println(a);
        System.out.println(b);
        int res=0;
        for(int l=(int)b;l>0;l--) {
            int m=a;
            b--;

            for (int i = (int) a; i < b; i++) {
                m++;
                if ((m + b) == s) {
                    res++;
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int k=2, s=37;
        Reccursion ex1= new Reccursion();
        System.out.println(ex1.rec(k,s));


    }
}

