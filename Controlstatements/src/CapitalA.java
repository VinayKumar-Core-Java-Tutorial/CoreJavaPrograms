public class CapitalA {
    public static void main(String args[]){
        int i,j;
        i=1;
        while(i<=5){
            j=1;
            while(j<=5){
                if(i==1 || j==1 ||j==5 || i==3){
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
