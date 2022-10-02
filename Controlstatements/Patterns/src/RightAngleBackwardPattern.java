public class RightAngleBackwardPattern {
    public static void main(String args[]){
        for(int i=1; i<=4; i++) {
            for(int j=3; j>=i; j--){  // for spaces
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){  // for print *
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
}
