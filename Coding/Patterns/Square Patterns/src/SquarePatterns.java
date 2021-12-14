public class SquarePatterns {
    public static void pattern1(int n){
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(i);
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
            while(j<=n){
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void pattern3(int n){
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(n-j+1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
