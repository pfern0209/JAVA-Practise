public class PaintJob {
    public static int getBucketCount(double width,double height,double areaPerBucket,int extraBuckets){
        if((width<=0)||(height<=0)||(areaPerBucket<=0)||(extraBuckets<0)){
            return -1;
        }else{
            int numberOfBuckets;
            int requiredBuckets;
            double area=width*height;
            numberOfBuckets=(int)(Math.ceil(area/areaPerBucket));
            requiredBuckets=numberOfBuckets-extraBuckets;
            return requiredBuckets;

        }

    }

    public static int getBucketCount(double width,double height,double areaPerBucket){
        if((width<=0)||(height<=0)||(areaPerBucket<=0)){
            return -1;
        }else{
            int numberOfBuckets;
            int requiredBuckets;
            double area=width*height;
            numberOfBuckets=(int)(Math.ceil(area/areaPerBucket));
            requiredBuckets=numberOfBuckets;
            return requiredBuckets;

        }

    }

    public static int getBucketCount(double area,double areaPerBucket){
        if((area<=0)||(areaPerBucket<=0)){
            return -1;
        }else{
            int numberOfBuckets;
            int requiredBuckets;
            numberOfBuckets=(int)(Math.ceil(area/areaPerBucket));
            requiredBuckets=numberOfBuckets;
            return requiredBuckets;

        }

    }
}
