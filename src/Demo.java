class MyException extends Exception{
    MyException(String message){
        super(message);
    }
}

class Demo {
    public static void main(String[] args) {
        System.out.println("Start Main"); // 1
        try{
            A();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("End Main");
    }

    public static void A() throws Exception {
        try{
           int x = 10 / 0;
        }catch (Exception e){
            throw new MyException("Error message");
        }
    }
}

// ---------------------------------------------------------------------


