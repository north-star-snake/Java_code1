public class Homework3_7 {
    public static void main(String[] args){
        int i = 37;
        if(PanSu(i)){
            System.out.println(i + "这是素数");
        }else{
            System.out.println(i + "这不是素数");
        }
    }

    public static Boolean PanSu(int x){
        int y = x/2;
        Boolean j = true;
        for(int i = 2;i <= y;i++){
            if(x%i == 0){
                j = false;
                break;
            }
        }
        return j;
    }
}
