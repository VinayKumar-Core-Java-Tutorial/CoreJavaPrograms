public class CapitalB {
    public static void main(String args[]){
        int i,j;
        i=1;
        while(i<=5){
            j=1;
            while(j<=5){
                if(j==1 || i==1 && j!=5|| i==3 && j!=5 || i==5 && j!=5 || i==2 && j==5 || i==4 && j==5){
                    System.out.print("* ");
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
