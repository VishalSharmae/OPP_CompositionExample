public class ComputerPrinter {

        private int tonerLevel;
        private int pagesPrinted;
        private boolean duplex;

        public ComputerPrinter(int tonerLevel, boolean duplex) {
            if (tonerLevel >= 0 && tonerLevel <= 100) {
                this.tonerLevel = tonerLevel;
            }else {
                this.tonerLevel = 0 ;
            }
            this.duplex = duplex;
        }

        public void fillToner(int refill){
            if (refill < 0){
                System.out.println("Cannot proceed refill : Refill Invalid");
            }else if (refill > 0 && refill < 100){
                this.tonerLevel += refill;
                System.out.println("Refilled toner, toner level = " + this.tonerLevel);
            }else {
                this.tonerLevel = 100;
            }
        }

        public void pagesToBePrinted(){
            if (!duplex) {
                this.pagesPrinted = 2 * this.tonerLevel;
                System.out.println("It is not a duplex printer so, the pages can be printed with toner level " + this.tonerLevel + "% is equals to " + this.pagesPrinted);
            }else{
                this.pagesPrinted = this.tonerLevel;
                System.out.println("It is a duplex printer so, pages can be printed with toner level " + this.tonerLevel + "% is equals to " + this.pagesPrinted);
            }
        }

}

