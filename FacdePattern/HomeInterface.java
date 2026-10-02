class HomeInterface{
    private final HomeService light;
    private final HomeService tv;
    private final HomeService airConditioning;

    public HomeInterface(){
        this.light = new Light();
        this.tv = new TV();
        this.airConditioning = new AirConditioning();
    }
    public void turnOnLight() { 
        light.turnOn(); 
    }
    public void turnOffLight() { 
        light.turnOff(); 
    }

    public void turnOnTV() { 
        tv.turnOn(); 
    }
    public void turnOffTV() { 
        tv.turnOff(); 
    }
 
    public void turnOnAirConditioning() { 
        airConditioning.turnOn(); 
    }
    public void turnOffAirConditioning() { 
        airConditioning.turnOff(); 
    }
 
    public void turnOnAll() {
        light.turnOn();
        tv.turnOn();
        airConditioning.turnOn();
    }
    public void turnOffAll() {
        light.turnOff();
        tv.turnOff();
        airConditioning.turnOff();
    }
} 
