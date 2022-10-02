public class CapitalW {
    public static void main(String args[]){
        int i=1;
        while(i<=5){
            int j=1;
            while(j<=5){
                if(j==1 || j==5 || i==4 && j==2 || i==4 && j==4 || i==3 && j==3){
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
