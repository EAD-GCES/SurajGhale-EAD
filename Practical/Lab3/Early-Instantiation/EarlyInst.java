class EarlyInst {
    private static EarlyInst obj = new EarlyInst();

    private EarlyInst(){}

    public static EarlyInst getInst() {
        return obj;
    }

    public void showMessage () {
        System.out.println("Hello World!");
    }
}