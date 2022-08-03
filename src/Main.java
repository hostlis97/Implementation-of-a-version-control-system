public class Main {
    public static void main(String[] args) {
        int[] sale = {10,2,3};
        SalesManager salesMng = new SalesManager(sale);
        System.out.println(salesMng.max());
    }
}
