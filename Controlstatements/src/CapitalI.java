public class CapitalI {
    public static void main(String args[]){
        for(int i=7; i>=1; i--){
            for(int j=7; j>=1; j--){
                if(i==1 || i==7 || j==1){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
