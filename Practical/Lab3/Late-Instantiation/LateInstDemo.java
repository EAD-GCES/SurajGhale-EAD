public class LateInstDemo {
    public static void main(String[] args){
        LateInst obj = LateInst.getInst();

        obj.showMessage();
    }
}