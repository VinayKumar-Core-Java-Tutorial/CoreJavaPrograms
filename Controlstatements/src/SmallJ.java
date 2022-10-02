public class SmallJ {
    public static void main(String args[]){
        int i=1;
        while(i<=7){
            int j=1;
            while (j <= 7) {
                if(j==4 && i!=2 || i==7 && j==3 || i==7 && j==2 || i==6 && j==2 || i==5 && j==2){
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
