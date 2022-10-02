public class SmallI {
    public static void main(String args[]){
        int i=1;
        do{
            int j=1;
            do{
                if(j==3 && i!=2 || i==6 && j!=1 && j!=2|| i==5 && j==6  ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                j++;
            }while(j<=6);
            System.out.println();
            i++;
        }while(i<=6);
    }
}
