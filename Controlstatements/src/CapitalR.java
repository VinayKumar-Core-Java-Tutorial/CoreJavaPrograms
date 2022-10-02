public class CapitalR {
    public static void main(String args[]){
        int i=1;
        do{
            int j=1;
            do{
                if(j==1 || i==1 && j!=5 || i==3 && j!=5|| i==2 && j==5 || i==4 && j==3 ||i==5 && j==4){
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
