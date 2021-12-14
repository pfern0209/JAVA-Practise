public class MirrorPatterns {
    public static void pattern1(int n){
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n-i+1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

//    public static void pattern2(int n){
//        int i=1;
//        while(i<=n){
//            int j=1;
//            while(j<=n-i){
//                System.out.print(" ");
//                j++;
//            }
//            while(j>n-i && j<=n){
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//
//        }
//    }

    public static void pattern2(int n){
        int i=1;
        while(i<=n){
            int spaces=1;
            while(spaces<=n-i){
                System.out.print(" ");
                spaces++;
            }
            int stars=1;
            while(stars<=i){
                System.out.print("*");
                stars++;
            }
            System.out.println();
            i++;
        }

    }

    public static void pattern3(int n){
        int i=1;
        while(i<=n){
            int spaces=1;
            while(spaces<=n-i){
                System.out.print("  ");
                spaces++;
            }
            int number=1;
            while(number<=i){
                System.out.print(number);
                number++;
            }
            System.out.println();
            i++;
        }

    }

    public static void pattern4(int n){
        int i=1;
        while(i<=n){
            int spaces=1;
            while(spaces<=n-i){
                System.out.print(" ");
                spaces++;
            }
            int number=1;
            while(number<=i){
                System.out.print(number);
                number++;
            }
            System.out.println();
            i++;
        }

    }

    public static void pattern5(int n){//Inverted Number
        int i=1;
        int k=n;
        while(i<=n){
            int j=1;
            while(j<=n-i+1){
                System.out.print(k);
                j++;
            }
            System.out.println();
            k--;
            i++;
        }

    }

    public static void isoscelesTriangle(int n){//Inverted Number
        int i=1;
        while(i<=n){
            int spaces=1;
            while(spaces<=n-i){
                System.out.print(" ");
                spaces++;
            }
            int numbers=1;
            while(numbers<=i){
                System.out.print(numbers);
                numbers++;
            }
            int decrement=i-1;
            while(decrement>=1){
                System.out.print(decrement);
                decrement--;
            }
            System.out.println();
            i++;
        }

    }

    public static void isoscelesTriangleStar(int n){//Inverted Number
        int i=1;
        while(i<=n){
            int spaces=1;
            while(spaces<=n-i){
                System.out.print(" ");
                spaces++;
            }
            int stars=1;
            while(stars<=i){
                System.out.print("*");
                stars++;
            }
            int decrementedStars=i-1;
            while(decrementedStars>=1){
                System.out.print("*");
                decrementedStars--;
            }
            System.out.println();
            i++;
        }
    }

    public static void codeTriangleOfNumbers(int n){//Inverted Number
        int i=1;
        while(i<=n){
            int spaces=1;
            while(spaces<=n-i){
                System.out.print("  ");
                spaces++;
            }
            int k=i;
            int number=1;
            while(number<=i){
                System.out.print(k);
                k++;
                number++;
            }
            int decrement=i-1;
            while(decrement>=1){
                System.out.print(k-2);//for n=4,k was last incremented to 6 so to print 4 we do k-2, now after k-- k's value is 5
                k--;
                decrement--;
            }
            System.out.println();
            i++;
        }
    }

    public static void codeTriangleOfNumbers2(int n){//Inverted Number
        int i=1;
        while(i<=n){
            int spaces=1;
            while(spaces<=n-i){
                System.out.print(" ");
                spaces++;
            }
            int numbers=1;
            int k=i;
            while(numbers<=i){
                System.out.print(k);
                numbers++;
                k++;
            }
            int decrement=1;
            int startingNumber=2*i-2;
            while(decrement<=i-1){
                System.out.print(startingNumber);
                decrement++;
                startingNumber--;
            }
            System.out.println();
            i++;
        }
    }

    public static void diamondOfStars(int n){
        int i=1;
           while(i<=(n/2)+1){
               int spaces=1;
               while(spaces<=((n/2)+1)-i){
                   System.out.print(" ");
                   spaces++;
               }
               int stars=1;
               while(stars<=i){
                   System.out.print("*");
                   stars++;
               }
               int decrementedStars=i-1;
               while(decrementedStars>=1){
                   System.out.print("*");
                   decrementedStars--;
               }
               System.out.println();
               i++;
           }
           //Approach1
           i=1;
           while(i<=(n/2)){
               int spaces=1;
               while(spaces<=i){
                   System.out.print(" ");
                   spaces++;
               }
               int stars=1;
               while(stars<=(n/2)-i+1){
                   System.out.print("*");
                   stars++;
               }
               int decrementedStars=(n/2)-i;
               while(decrementedStars>=1){
                   System.out.print("*");
                   decrementedStars--;
               }
               i++;
               System.out.println();
           }

    }
}
