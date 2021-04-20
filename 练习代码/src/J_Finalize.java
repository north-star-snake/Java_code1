public class J_Finalize {
    public static void main(String[] args){
        J_Book book1 = new J_Book(1);
        new J_Book(2);
        new J_Book(3);
        System.gc();
    }
}
