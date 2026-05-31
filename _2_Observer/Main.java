package _2_Observer;
import java.util.ArrayList;
import java.util.List;

interface Observer{
    void update(float temperature);
}

interface Subject{
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notify(float temperature);
}

class MobileDisplay implements Observer{
    @Override
    public void update(float temperature){
        System.out.println("update in Temperature : "+temperature+" degree celcius");
    }
}

class TvDisplay implements Observer{
    @Override
    public void update(float temperature){
        System.out.println("update in Temperature : "+temperature+" degree celcius");
    }
}

class TabDisplay implements Observer{
    @Override
    public void update(float temperature){
        System.out.println("update in Temperature : "+temperature+" degree celcius");
    }
}

class WeatherStation implements Subject{
    List<Observer> observers;
    float temperature;

    WeatherStation(){
        this.observers=new ArrayList<>();
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        observers.remove(o);
    }

    public void notify(float temperature){
        for(Observer o:observers){
            o.update(temperature);
        }
    }

    public void setTemperature(float temperature){
        this.temperature=temperature;
        notify(temperature);
    }
}


public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation=new WeatherStation();
        Observer mobile=new MobileDisplay();
        Observer tv=new TvDisplay();
        Observer tab=new TabDisplay();

        weatherStation.registerObserver(mobile);
        weatherStation.registerObserver(tv);
        weatherStation.registerObserver(tab);
        
        weatherStation.setTemperature(27);

        System.out.println("----------------------------------------------");
        
        weatherStation.removeObserver(tv);

        weatherStation.setTemperature(29);
    }
}
