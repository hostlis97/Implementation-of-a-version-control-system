public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = this.max();
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long avg() {
        long avg = 0;
        for (long sale : sales) {
            avg +=sale;
        }
        avg = (avg-this.max()-this.min())/(sales.length-2);
        return avg;
    }
}
