public class Button {

    private ClickListener[] listeners = new ClickListener[3];
    private int count = 0;

    public void addListener(ClickListener listener){
        listeners[count++]=listener;
    }

    public void click(){
        for (int i = 0; i<count; i++){
            listeners[i].onClick();
        }
    }


}
