public class Alphabatical5 {
    public static void main(String args[]){
        char ch='A';
        for(int i=1; i<=4; i++){
            for(int k=4; k>=i; k-- ){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(ch);
            }
            for(int l=2; l<=i; l++){
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
        char ch1='F';
        for(int i=1; i<=4; i++){
            for(int k=1; k<=i; k++){
                System.out.print(" ");
            }
            for(int j=4; j>=i; j--){
                System.out.print(ch1);
            }
            for(int l=2; l>=i; l--){
                System.out.print(ch1);
            }
            System.out.println();
            ch1++;
        }
    }
}
