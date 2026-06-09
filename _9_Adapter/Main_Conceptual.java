package _9_Adapter;

class Client{
    Target target;

    public Client(){
        target=new Adapter(new Adaptee());
    }

    public void request(){
        target.request();
    }
}

interface Target{
    void request();
}

class Adapter implements Target{
    Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee=adaptee;
    }

    @Override
    public void request(){
        this.adaptee.specificRequest();
    }
}

class Adaptee{
    public void specificRequest(){
        System.out.println("Connected");
    }
}

public class Main_Conceptual {
    public static void main(String[] args) {
        Client c1=new Client();

        c1.request();
    }
}