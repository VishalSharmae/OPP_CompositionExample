public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100 ) {
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount > 0 && tonerAmount <= 100){
            if ((this.tonerLevel += tonerAmount) <= 100){
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            }else {
                return -1;
            }
        }else{
            return -1;
        }
    }

    public int printPages(int page){
        int pagesToPrint ;
//        if (duplex){
//            pagesToPrint = (page / 2) + (page % 2);
//        }else {
//            pagesToPrint = page;
//        }
        // trying another method using ternary operator
        pagesToPrint = (duplex) ? (Math.round((float) page/2)) : page;
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
