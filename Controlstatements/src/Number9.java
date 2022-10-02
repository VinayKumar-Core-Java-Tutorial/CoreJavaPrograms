public class Number9 {
    public static void main(String args[]){
        int i=1;
        while (i <= 5) {
            int j=1;
            while (j <= 5) {
                if(j==4 || i==1 && j==3 || i==2 && j==1 || i==3 && j==3 || i==1 && j==2 || i==3 && j==2){
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
