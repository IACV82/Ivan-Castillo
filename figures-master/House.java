class House
{
    Square wall;
    Square window;
    Triangle roof;
    
    //metodo especial
    House(){
        
    }
    
    void initialize(){
    
        wall = new Square();
        window = new Square();
        roof = new Triangle();
    }
    
    void draw(){
        wall.makeVisible();
        window.makeVisible();
        roof.makeVisible();
        
        //Instrucciones para formar la casa
        wall.changeSize(100);
        window.changeColor("black");
        window.changeSize(30);
        window.moveRight();
        window.moveDown();
        roof.moveUp();
        roof.moveUp();
        roof.moveUp();
        roof.moveRight();
    }
    
    void moveRight(){
        wall.moveRight();
        window.moveRight();
        roof.moveRight();
    }
    
    void moveLeft(){
        wall.moveLeft();
        window.moveLeft();
        roof.moveLeft();
    }
}