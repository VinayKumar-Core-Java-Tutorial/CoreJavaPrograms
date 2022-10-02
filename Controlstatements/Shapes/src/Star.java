public class Star {
    public static void main(String []args){
        int i,j;
        i=1;
        while(i<=9){
            j=1;
            while(j<=9){
                if(i==1 && j==5 || i==2 && j==4 || i==2 && j==6 || i==3 && j!=4 && j!=5 && j!=6 || i==4 && j==2 || i==4 && j==8
                        || i==5 && j==3 || i==5 && j==7 || i==6 && j==2 || i==6 && j==8 || i==7 && j!=4 && j!=5 && j!=6 ||
                        i==8 && j==4 || i==8 && j==6 || i==9 && j==5){
                    System.out.print(". ");
                }else{
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
