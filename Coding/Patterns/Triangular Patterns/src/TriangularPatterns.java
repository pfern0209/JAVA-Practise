public class TriangularPatterns {
    public static void pattern1(int n){
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void pattern2(int n){
        int i=1;
        while(i<=n){
            int j=1;
            int k=i;
            while(j<=i){
                System.out.print(k);
                k++;
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void pattern3(int n){
        int i=1;
        int count=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(count);
                count++;
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void starPattern(int n){
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void numberPattern(int n){
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void reverseNumber(int n){
        int i=1;

        while(i<=n){
            int j=1;
            int startingNumber=i;
            while(j<=i){
                System.out.print(startingNumber);
                startingNumber--;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
