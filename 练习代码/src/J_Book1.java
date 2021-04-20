public class J_Book1 {

    public int m_id;
    public static int m_bookNumber = 0;

    public J_Book1(){
        m_bookNumber ++;
    }

    public void mb_info(){
        System.out.println("当前书的编号是" + m_id);
    }

    public static void mb_infoStatic(){
        System.out.println("书的总数是" + m_bookNumber);
    }

    public static void main(String[] args){
        J_Book1 a = new J_Book1();
        J_Book1 b = new J_Book1();
        a.m_id = 1101;
        b.m_id = 1234;
        System.out.print("变量a对应的");
        a.mb_info();
        System.out.print("变量b对应的");
        b.mb_info();
        J_Book1.mb_infoStatic();
        System.out.println("比较(a.m_bookNumber==J_Book.m_bookNumber)"+"的结果是:"+(a.m_bookNumber==J_Book1.m_bookNumber));
        System.out.println("比较(b.m_bookNumber==J_Book.m_bookNumber)"+"的结果是:"+(b.m_bookNumber==J_Book1.m_bookNumber));
    }

}
