public class CapitalH {
    public static void main(String args[]){
        int i=1;
        do{
            int j=1;
            do{
                if(j==1 || j==8 || i==4){
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
