public class Printer {
    private int tonerLevel=100;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel,boolean duplex){
        if(tonerLevel>-1 && tonerLevel<=100){
            this.tonerLevel=tonerLevel;
        }else{
            this.tonerLevel=-1;
        }
        this.duplex = duplex;
        this.pagesPrinted=0;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }



    public int printPages(int pages){
        int pagesToPrint=pages;
        if(isDuplex()){
            pagesToPrint=pagesToPrint/2+pagesToPrint%2;
            this.pagesPrinted=this.pagesPrinted+pagesToPrint;
        }
        return pagesToPrint;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount>0 && tonerAmount<100){
            if((this.tonerLevel+tonerAmount)>100){
                return -1;
            }else{
                this.tonerLevel=this.tonerLevel+tonerAmount;
                return this.tonerLevel;
            }
        }
        return -1;
    }

    //    private void print(boolean inDuplex, double pages){
//        if(inDuplex && isDuplex()) {
//            this.pagesPrinted = getPagesPrinted() + (int)Math.ceil(pages/2);
//        }else if(inDuplex==false && !duplex) {
//            this.pagesPrinted = getPagesPrinted() + (int)pages;
//        }else{
//            System.out.println("Incompatible");
//        }
//    }


}
