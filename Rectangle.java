public class Rectangle extends Shape {

double width;

double height;

public Rectangle(){

width=1;

height=1;

}

public Rectangle( double newWidth , double newHeight, String newcolour ){

width = newWidth;

height= newHeight;

 Shape.setColor(newcoulor);
}     

public int getWidth(){
    
return width;

    }

public int getHeight(){

    return height;
}

public double area(){

return height * width;

}

public double perimeter () {

return (2*width)+(2*height);

}



}