//SAM Single Abstract Method in AnonymousInnerClass using lamda expression it will support only one method decleration
public interface AnonymousInnerClass {
    /*public void shows();*/
    public void show();

    public static void main(String arg[]) {
        //() represent the show method implementation
        AnonymousInnerClass anonymousInnerClass =/*new AnonymousInnerClass() {
            @Override
            public void show() {

            }

            @Override
            public void shows() {

            }
        };*/
                () -> {
                    System.out.println("this is anonymous inner class using lamda expression");
                };
        anonymousInnerClass.show();
    }
}
