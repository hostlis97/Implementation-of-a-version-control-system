public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = this.max();
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int avg() {
        int avg = 0;
        for (int sale : sales) {
            avg +=sale;
        }
        avg = (avg-this.max()-this.min())/(sales.length-2);
        return avg;
    }
}
