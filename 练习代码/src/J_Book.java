public class J_Book {
    public  int m_id;
    public J_Book(int i){
        m_id = i;
    }
    protected void finalize(){
        switch (m_id)
        {
            case 1:
                System.out.print("《飘》");
                break;
            case 2:
                System.out.print("《Java程序设计基础》");
                break;
            case 3:
                System.out.print("《罗马假日》");
                break;
            default:
                System.out.print("未知书籍");
                break;
        }
        System.out.println("所对应的实例对象存储单元被回收");
    }
}


