public class MyOwnAutoShop {
    public static void main(String[] args) {
        
        Sedan sedan1 = new Sedan(70,17000,"pink",27);
        Ford ford1 = new Ford(90,42000,"purple", 2023,20);
        Ford ford2 = new Ford(55,20000,"white",2015,25);
        Car carro = new Car(110,45000,"black");
        
        System.out.println("The Sedan costs "+ sedan1.getSalePrice());
        System.out.println("The first ford costs "+ ford1.getSalePrice());
        System.out.println("The second ford costs "+ ford2.getSalePrice());
        System.out.println("The average cost of a car is "+ carro.getSalePrice());
    
}

}
