public class SmallG {
    public static void main(String args[]){
        int i=1;
        while(i<=6){
            int j=1;
            while (j <= 6) {
                if(i==1 && j!=1 && j!=6 && j!=2|| i==3 && j!=1 && j!=2|| i==6 && j!=1 && j!=6 && j!=2|| i==2 && j==6 ||
                        i==2 && j==2 || i==5 && j==6 || i==4 && j==6 || i==5 && j==2){
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
