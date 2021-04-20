public class Su {
    public static void main(String[] args)
    {
        int num=99;
        su(num);

    }
    public static void su(int a)
    {
        int b=2,flag=1;
        for(b=2;b<a;b++){
            if(a%b==0)
            {
                flag=0;
                break;
            }
        }
        if(flag==1)
            System.out.println(a+"是素数");
        else
            System.out.println(a+"不是素数");
    }
}
