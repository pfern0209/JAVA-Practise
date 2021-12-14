public class CharacterPatterns {
    public static void pattern1(int n){
        char ch='A';
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print((char)(ch+j-1));
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void pattern2(int n){
        char ch='A';
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print((char)(ch+j-1+i-1));
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void pattern3(int n){
        char ch='A';
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print((char)(ch+i-1));
                j++;
            }
            System.out.println();
            i++;
        }
    }



    public static void pattern4(int n){
        int i=1;
        while(i<=n){
            int j=1;
            char currentCharacter=(char)('A'+i-1);
            while(j<=i){
                System.out.print(currentCharacter);
                currentCharacter=(char)(currentCharacter+1);
                j++;
            }
            System.out.println();
            i++;
        }
    }

//    public static void pattern5(int n){
//        int i=1;
//        while(i<=n){
//            char ch=(char)('A'+n-1);
//            int j=1;
//            while(j<=i){
//                System.out.print(ch);
//                ch=(char)(ch-1);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//    }

    public static void pattern5(int n){
        int i=1;
        while(i<=n){
            char ch=(char)('A'+n-1-i+1);
            int j=1;
            while(j<=i){
                System.out.print(ch);
                ch=(char)(ch+1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
