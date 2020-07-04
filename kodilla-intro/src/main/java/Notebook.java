public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
            if (this.price > 600 || this.price < 1000) {
                System.out.println("The price is good.");
            } else if (this.price > 1000) {
                System.out.println("This notebook is expensive.");
            }
        }
    }
    public void checkWeight() {
        if (this.weight < 700) {
            System.out.println("This notebook is light.");
        } else if (this.weight > 700 && this.weight < 1700) {
                System.out.println("The weight is not heavy.");
        } else if (this.weight > 1900) {
                System.out.println("This notebook is too heavy.");
            }
        }
      public void checkYear() {
        if (this.year < 1990) {
            System.out.println("This notebook is very cheap");
        } else if (this.year > 1990 && this.year < 2006 ) {
            System.out.println("This price is good");
        }  else if (this.year > 2009) {
                    System.out.println("This notebook is quite expensive");
                }
           }
        }





















