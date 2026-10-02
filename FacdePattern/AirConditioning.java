class AirConditioning implements HomeService {
    @Override 
    public void turnOn(){
        System.out.println("Air Conditioner in ON");
    }
    @Override 
    public void turnOff(){
        System.out.println("Air Conditioner is OFF");
    } 
}