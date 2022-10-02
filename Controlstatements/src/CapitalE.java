public class CapitalE {
    public static void main(String args[]){
        int i=1;
        do{
            int j=1;
            do{
                if(j==1 || i==1 || i==3 || i==5){
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
