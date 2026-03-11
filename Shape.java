abstract Class Shape {

String color

Shape(){color = "red";}

Shape(String newColor){
    color= newColor;
    }

public String getColor(){
return color;
    }
public void setColor(String newColor){

    color=newColor;
}

abstract double area();

abstract double perimeter();

}