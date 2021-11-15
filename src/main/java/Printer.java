public class Printer {

    public int paperCount;
    public int tonerVolume;

    public Printer(int paperCount, int tonerVolume){
        this.paperCount = paperCount;
        this.tonerVolume = tonerVolume;
    }

    public int getPaperCount(){ return this.paperCount; }

    public int getTonerVolume(){ return this.tonerVolume; }

    public boolean canPrint(int copies, int pages){
        int numberOfPages = copies * pages;
        if (numberOfPages < paperCount){
            this.paperCount -= numberOfPages;
            this.tonerVolume -= numberOfPages;
            return true;
        } else {
            return false;
        }
    }

}
