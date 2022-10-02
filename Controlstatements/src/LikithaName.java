public class LikithaName {
    public static void main(String args[]) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                if(j==1 || i==5){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            for(int space=1; space<=3; space++)
                System.out.print(" ");
            for(int k=1; k<=5; k++){
                if(i==1 || k==3 || i==5){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            for(int space=1; space<=3; space++)
                System.out.print(" ");
            for(int l=1; l<=5; l++){
                if(l==1 || i==1 && i+l==5 || i==2 && i+l==5 || i==3 && i+l==5 || i==4 && i+l==7 || i==5 && i+l==9){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            for(int space=1; space<=3; space++)
                System.out.print(" ");
            for(int m=1; m<=5; m++){
                if(i==1 || m==3 || i==5){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            for(int space=1; space<=3; space++)
                System.out.print(" ");
            for(int n=1; n<=5; n++){
                if(i==1 || n==3){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            for(int space=1; space<=3; space++)
                System.out.print(" ");
            for(int o=1; o<=5; o++){
                if(o==1 || o==5 || i==3){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            for(int space=1; space<=3; space++)
                System.out.print(" ");
            for(int p=1; p<=5; p++){
                if(p==1 || p==5 || i==1 || i==3){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
