public class J_Month {

    private int m_month = 1;
    public int mb_getMonth(){
        return m_month;
    }

    public int mb_setMonth(int m){
        if(m<1)
            m_month = 1;
        else if(m>12)
            m_month = m;
        return m_month;
    }

}
