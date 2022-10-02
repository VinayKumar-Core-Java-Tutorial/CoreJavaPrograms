public class Hexagon {
    public static void main(String []args){
        for(int i=1; i<=13; i++){
            for(int j=1; j<=13; j++){
                if(i==3 && j==5 || i==3 && j==6 || i==3 && j==7 || i==3 && j==8 || i==3 && j==9 || i==4 && j==4 || i==4 && j==10||
                        i==5 && j==3 || i==5 && j==11 || i==6 && j==2 || i==6 && j==12 || i==7 && j==3 || i==7 && j==11 ||
                        i==8 && j==4 || i==8 && j==10 || i==9 && j!=1 && j!=2 && j!=3 && j!=4 && j!=10 && j!=11 && j!=12 && j!=13){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
