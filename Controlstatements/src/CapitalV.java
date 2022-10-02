public class CapitalV {
    public static void main(String args[]){
        for(int i=1; i<=11; i++){
            for(int j=1; j<=11; j++){
                if(i==1 && j==1 || i==1 && j==11 || i==2 && j==2 || i==2 && j==10 || i==3 && j==3 || i==3 && j==9 || i==4 && j==4 || i==4 && j==8 ||
                        i==5 && j==5 || i==5 && j==7 || i==6 && j==6){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
