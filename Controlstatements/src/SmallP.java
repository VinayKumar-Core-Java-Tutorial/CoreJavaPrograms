public class SmallP {
    public static void main(String args[]){
        int i=1;
        do{
            int j=1;
            do{
                if(j==1 && i!=1 || i==2 && j!=4 && j!=5 || i==4 && j!=4 && j!=5 || i==3 && j==4){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                j++;
            }while(j<=5);
            System.out.println();
            i++;
        }while(i<=5);
    }
}
