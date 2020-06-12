public class LeapYear {
    int rok;

    public LeapYear(int rok) {
        this.rok = rok;


    }

    public boolean isLeap() {
        if (this.rok % 4 == 0) {
            System.out.println("Rok jest przestepny"+true);
            return true;


        } else if (this.rok % 100 == 0) {
            System.out.println("Rok jest przestepny"+true);
            return true;
        } else if (this.rok % 400 == 0) {
            System.out.println("Rok jest przestepny"+true);
            return true;

        } else System.out.println("Rok jest przestepny"+false);return false;
    }


}
