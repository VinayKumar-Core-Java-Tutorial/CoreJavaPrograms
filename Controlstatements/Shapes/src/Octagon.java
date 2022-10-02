public class Octagon {
    public static void main(String []args){
        for(int i=1; i<=11; i++){
            for(int j=1; j<=11; j++){
                if(i==1 && j==4 || i==1 && j==5 || i==1 && j==6 || i==1 && j==7 || i==1 && j==8 || i==2 && j==3 || i==2 && j==9 || i==3 && j==2 || i==3 && j==10
                        || j==1 && i!=1 && i!=2 && i!=3 && i!=9 && i!=10 && i!=11 && i!=8|| j==11 && i!=1 && i!=2 && i!=3 && i!=9 && i!=10
                        && i!=11 && i!=8|| i==8 && j==2 || i==8 && j==10 || i==9 && j==3 || i==9 && j==9 || i==10 && j==4 ||
                        i==10 && j==6 || i==10 && j==7 || i==10 && j==8 || i==10 && j==5 ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
