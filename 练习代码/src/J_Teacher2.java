class J_Employee2{
    public int m_workYear;
    public J_Employee2(){
        m_workYear = 1;
    }
    public void  mb_printInfo(){
        System.out.println("该职工的工作年限为"+m_workYear);
    }
}

public class J_Teacher2 extends J_Employee2{
    public int m_classHour;
    public J_Teacher2(){
        m_classHour = 96;
    }

    public void mb_printInfo(){
        System.out.println("该教师的工作年限为" + m_workYear);
        System.out.println("该教师授课的课时为" + m_classHour);
    }

    public static void main(String[] args){
        J_Employee2 a = new J_Employee2();
        a.mb_printInfo();
        a = new J_Teacher2();
        a.mb_printInfo();
    }
}
