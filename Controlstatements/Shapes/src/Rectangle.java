public class Rectangle {
    public static void main(String []args){
        int i,j;
        i=1;
        while(i<=9){
            j=1;
            while(j<=9){
                if(i==3 || i==6 || j==1 && i!=1 && i!=2 && i!=7 && i!=8 && i!=9 || j==9 && i!=1 && i!=2 &&
                        i!=7 && i!=8 && i!=9){
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
