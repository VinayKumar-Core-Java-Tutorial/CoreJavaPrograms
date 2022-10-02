public class Alphabatical4 {
    public static void main(String args[]){
        char ch='A';
        for(int i=1; i<=5; i++){
            for(int k=4; k>=i; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(ch+" ");
            }
            System.out.println();
            ch++;
        }
        char ch1='F';
        for(int i=1; i<=5; i++){
            for(int k=1; k<=i; k++){
                System.out.print(" ");
            }
            for(int j=4; j>=i; j--){
                System.out.print(ch1+" ");
            }
            System.out.println();
            ch1++;
        }
    }
}
