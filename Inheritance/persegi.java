package Inheritance;

public class persegi extends BangunDatar2{
    float sisi;

    public void luas(){
        float luas=sisi*sisi;
        System.out.println("Luas Persegi = " + luas);
    }
    public void keliling(){
        float keliling=4*sisi;
        System.out.println("keliling Persegi = " + keliling);
    }
}
