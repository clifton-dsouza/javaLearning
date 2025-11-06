class calculator{
     
    public void pen(){
        System.out.println("Pen is moving");
    }

    public String cost(int cost){
        if(cost >= 15){
            return "pen";
        }else{
            return "Nothing";
        }
        
    }
}





public class javalearnBasic{
    public static void main(String[] args){
        calculator calc = new calculator();
        String s = calc.cost(5);
        calc.pen();
        System.out.println(s);
    }
}
