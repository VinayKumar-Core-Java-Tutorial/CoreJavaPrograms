public class PentagonShape {
    public static void main(String []args){
       int i=1;
       do{
           int j=1;
           do{
               if(i==1 && j==7 || i==2 && j==6 || i==2 && j==8 || i==3 && j==5 || i==3 && j==9 || i==4 && j==4 || i==4 && j==10 ||
                      i==5 && j==3 || i==5 && j==11 || i==6 && j==2 || i==6 && j==12 || i==7 && j==3 || i==7 && j==11 ||
                         i==8 && j==4 || i==8 && j==10 || i==9 && j!=1 && j!=2 && j!=3 && j!=11 && j!=12 && j!=13
                             && j!=4 && j!=10){
                   System.out.print("* ");
               }else{
                   System.out.print("  ");
               }
              j++;
           }while(j<=13);
           System.out.println();
           i++;
       }while(i<=13);

    }
}
