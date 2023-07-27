public class AmericanFlagExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if(i%2==1){
                for(int k=0;k<6;k++){System.out.print("* ");}
                for(int k=0;k<34;k++){System.out.print("=");}
            }
            else{
                for(int k=0;k<5;k++){System.out.print(" *");}
                System.out.print("  ");
                for(int k=0;k<34;k++){System.out.print("=");}
            }
            System.out.println("");
        }
        for (int j=0;j<6;j++){
            for(int l=0;l<=45;l++){
                System.out.print("=");
            }
            System.out.println("");
        }
    }
}

