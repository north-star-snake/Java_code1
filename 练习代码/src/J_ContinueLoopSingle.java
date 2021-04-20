public class J_ContinueLoopSingle {
    public static void main(String[] args){
        for(int i = 0;i < 10;i++){
            if(1<i && i<8)
                continue;
            System.out.println("i="+i);
        }
    }
}
