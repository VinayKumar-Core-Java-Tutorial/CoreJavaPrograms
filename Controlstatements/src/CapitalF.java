public class CapitalF {
    public static void main(String args[]){
        int i=1;
        while(i<=5){
            int j=1;
            while(j<=5){
                if(j==1 || i==1 || i==3){
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
