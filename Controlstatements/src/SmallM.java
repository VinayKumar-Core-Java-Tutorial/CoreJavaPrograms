public class SmallM {
    public static void main(String args[]){
        int i=1;
        do{
            int j=1;
            do{
                if(j==2 && i!=1 && i!=2 && i!=3 && i!=8 && i!=7|| j==3 && i==4 || j==4 && i==5 ||
                        j==4 && i==6 || i==4 && j==5 || i==4 && j==6 || i==5 && j==6 || i==6 && j==6   ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                j++;
            }while(j<=8);
            System.out.println();
            i++;
        }while(i<=8);
    }
}
