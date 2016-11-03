public class Main {

    public static void main(String[] args) {


        Canvas canvas = new Canvas();
        Ussr ussr = new Ussr();

        Button button = new Button();
        button.addListener(canvas);
        button.addListener(ussr);

        button.click();


//Lambda

    /*    Collection.sort(names,(String a, String b)->{
            return b.compareTo(a);
        });

        sort(names,(String a, String b)->b.compareTo(a));

        */

    }
}
