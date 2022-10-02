public class SmallX {
    public static void main(String args[]){
        int i=1;
        while(i<=5){
            int j=2;
            while(j<=5){
                if(i==2 && j==2 || i==2 && j==4 ||j==3 && i!=1 && i!=2 && i!=5 || i==5 && j==2 || i==5 && j==4){
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
