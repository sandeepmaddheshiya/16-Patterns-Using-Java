public class HollowButterfly {
    public static void main(String args[]){
        for (int i=1;i<=5;i++){
            for(int j=1;j<=10;j++){
                int sum=i+j;
                if(j==1||i==j||j==10||sum==11){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i=5;i>=1;i--){
            for(int j=1;j<=10;j++){
                int sum=i+j;
                if(j==1||i==j||j==10||sum==11){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
