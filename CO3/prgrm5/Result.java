interface ResultInt{
    void res();
}

class Student implements ResultInt{
    public void res(){
        System.out.println("Academic Result is 93/100"); 
    }
}

class Sports implements ResultInt{
    public void res(){
        System.out.println("Sports score is 91/120");
    }
}

public class Result {
    public static void main(String[] args) {
        ResultInt ob1=new Student();
        ResultInt ob2=new Sports();
        ob1.res();
        ob2.res();
    }
}