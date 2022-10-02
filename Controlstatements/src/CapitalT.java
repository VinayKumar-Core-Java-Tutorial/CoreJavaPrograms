public class CapitalT {
    public static void main(String args[]){
        int i=1;
        do{
            int j=1;
            do{
                if(i==1 || j==3){
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
