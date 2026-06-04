package _6_AbstractFactory;

interface Button{
    void paint();
}

interface CheckBox{
    void render();
}

class WindowsButton implements Button{
    @Override
    public void paint(){
        System.out.println("Windows Paint");
    }
}

class WindowsCheckBox implements CheckBox{
    @Override
    public void render(){
        System.out.println("Windows CheckBox");
    }
}

class MacButton implements Button{
    @Override
    public void paint(){
        System.out.println("Mac Paint");
    }
}

class MacCheckBox implements CheckBox{
    @Override
    public void render(){
        System.out.println("Mac CheckBox");
    }
}

interface GUIFactory{
    Button createButton();
    CheckBox createCheckBox();
}

class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton(){
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox(){
        return new WindowsCheckBox();
    }
}

class MacFactory implements GUIFactory{
    @Override
    public Button createButton(){
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox(){
        return new MacCheckBox();
    }
}

public class Main {
    public static void main(String[] args) {
        GUIFactory factory;

        String os="Mac";

        if(os.equalsIgnoreCase("Windows")){
            factory=new WindowsFactory();
        }else{
            factory=new MacFactory();
        }

        Button button = factory.createButton();
        CheckBox checkBox = factory.createCheckBox();

        button.paint();
        checkBox.render();
    }
}
