public class Number8 {
    public static void main(String args[]){
        int i=1;
        do{
            int j=1;
            do{
                if(i==1 && j!=1 && j!=5 || i==2 && j!=1 && j!=3 && j!=5 || i==3 && j==3 ||
                        i==4 && j!=1 && j!=3 && j!=5 || i==5 && j!=1 && j!=5){
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
