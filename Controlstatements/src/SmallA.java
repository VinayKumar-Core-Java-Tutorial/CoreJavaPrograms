public class SmallA {
    public static void main(String args[]){
        for(int i=1; i<=8; i++){
            for(int j=1; j<=8; j++){
                if(i==1 && j!=8 && j!=1 && j!=7 || j==1 && i!=8 && i!=1 && i!=7 ||i==7 && j!=8 && j!=1  ||
                        j==7 && i!=8 && i!=1 || i==8 && j==8 ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
