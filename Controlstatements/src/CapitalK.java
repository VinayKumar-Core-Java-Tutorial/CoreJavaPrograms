public class CapitalK {
    public static void main(String args[]){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                if(j==1 || i==1 && i+j==5 || i==2 && i+j==5 || i==3 && i+j==5 || i==4 && i+j==7 || i==5 && i+j==9){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
