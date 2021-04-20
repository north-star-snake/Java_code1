public class J_Teacher1 extends J_Employee1{

    public int m_classHour;

    public J_Teacher1(){
        m_classHour = 96;
    }

    public void mb_printInfo(){
        System.out.println("该教师的工作年限为" + m_workYear);
        System.out.println("该教师的授课课时为" + m_classHour);
    }

}
