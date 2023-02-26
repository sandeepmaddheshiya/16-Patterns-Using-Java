public class HollowRhombus {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=9;j++){
                int sum=i+j;
                if(sum==6||sum==10||i==1&&j>=6||i==5&&j<6){
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
