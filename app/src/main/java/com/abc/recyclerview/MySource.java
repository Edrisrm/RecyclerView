package com.abc.recyclerview;

public class MySource extends Source{


    public MySource(String title, int image) {
        super(title, image);
    }
    @Override
    public String getTitle() { //para recoger el parametro de la clase padre y modificar un titulo puedo usar la clase super
        return super.getTitle() + " agregue esto adicionalmente";
    }
}
