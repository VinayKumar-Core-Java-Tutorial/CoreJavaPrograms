public class CapitalU {
    public static void main(String arg[]){
        int i=1;
        while(i<=5){
            int j=1;
            while(j<=5){
                if(j==1 && i!=5 || j==5 && i!=5 || i==5 && j!=1 && j!=5){
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
