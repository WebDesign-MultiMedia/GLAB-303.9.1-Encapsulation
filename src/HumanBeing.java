//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HumanBeing {
    private float height;
    private float weight;
    private float bmi;

    public HumanBeing(float weight, float height, float bmi){
        this.weight = weight;
        this.height = height;
        this.bmi = bmi;

    }
    public HumanBeing()
    {

    }
    public float getWeight(){
        return weight;
    }
    public void setWeight(float weight){
        this.weight = weight;
    }
    public float getHeight(){
        return height;
    }
    public void setHeight(float height){
        this.height = height;
    }
    public float getBmi(){
        return bmi;
    }
    public void setBmi(float bmi){
        this.bmi = bmi;
    }
}

