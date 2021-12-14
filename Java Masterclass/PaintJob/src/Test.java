public class Test {
    public static void test(){
        double width=2.75;
        double height=3.25;
        double area=width*height;
        System.out.println(area);
        double areaPerBucket=2.5;
        int buckets=(int)(Math.ceil(area/areaPerBucket));
        System.out.println(buckets);
    }
}
