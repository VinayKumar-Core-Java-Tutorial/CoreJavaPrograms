public class SmallD {
    public static void main(String args[]){
        int i=1;
        while(i<=5){
            int j=1;
            while (j <= 5) {
                if(j==4 || i==3 && j!=5 && j!=1 || i==5 && j!=5 && j!=1 || i==4 && j==1){
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
