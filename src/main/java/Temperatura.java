public class Temperatura {
    //ATRIBUTO PRIVADO PARA ARMAZENAR TEMP - CELCIUS
    private double tempCelsius; 
    
    //  CONSTRUTOR - PARA LER A TEMPERATURA
    public Temperatura(double tempInicialCelcius){
        this.tempCelsius = tempInicialCelcius;
    }
    
     //GETTER - PARA MUDAR A TEMPERATURA
    public double getTemperaturaCelsius(){
    return tempCelsius;
    }
    
    //SETTER - PARA MUDAR A TEMPERATURA 
    public void setTemperaturaCelcius(double mudarTempCelcius) {
        this.tempCelsius =mudarTempCelcius;
    }
    
    //MÉTODO PARA CONVERTER CELCIUS PARA FAHRENHEIT
    public double converterParaFahrenheit(){
        return (tempCelsius*9/5)+32;
    }
    
    //MÉTODO PARA CONVERTER CELSIUS PARA KELVIN
   public double converterParaKelvin(){
        return tempCelsius+273.15; 
}
