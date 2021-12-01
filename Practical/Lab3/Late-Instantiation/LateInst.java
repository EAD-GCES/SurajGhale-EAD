class LateInst {
    private static LateInst obj;
    private LateInst(){}

    public static LateInst getInst(){
        if(obj == null){
            synchronized(LateInst.class){
                if(obj == null){
                    obj = new LateInst();
                }
            }
        }
        return obj;
    }

    public void showMessage(){
        System.out.println("Hello World");
    }
}