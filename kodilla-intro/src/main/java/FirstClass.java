public class FirstClass {
    public static void main(String[] args) {
        checkNotebookParameters(600, 500, 1990);

        checkNotebookParameters(2000, 900, 2005);

        checkNotebookParameters(1600, 1100, 2010);
    }

    private static void checkNotebookParameters(int weight, int price, int year) {
        Notebook notebook = new Notebook(weight, price, year);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
    }
}
