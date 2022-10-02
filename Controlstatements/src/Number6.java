public class Number6 {
    public static void main(String args[]){
        int i=1;
        while (i <= 5) {
            int j=1;
            while (j <= 5) {
                if(i==1 && j!=1 && j!=5 && j!=2|| j==2 && i!=5 && i!=1 || i==5 && j==3 || i==5 && j==4 ||
                        i==4 && j==5 || i==3 && j!=1 && j!=5){
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
