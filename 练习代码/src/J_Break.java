public class J_Break {
    public static void main(String[] args){
        int i = 0;
        aBreakBlock:
        {
            System.out.println("在break语句之前");
            if(i<=0)
                break aBreakBlock;
            System.out.println("在if和break语句之后");
        }
        System.out.println("在aBreakBlock语句块之后");
    }
}