package ch08extends.lectre;

public class C20polymorphism {
    public static void main(String[] args) {

        Item item = getItem();
        item.printDesc();

        Item item1 = getItem();
        item.printDesc();

        System.out.println("게임 오버!");
    }

    private static Item getItem() {
        double d = Math.random();

        if( d < 0.5 ){
            return new potion();
        } else {
            return new Map();
        }
    }
}

class Item{
    public void printDesc(){
        System.out.println("아이템 입니다.");
    }
}

class potion extends Item{
    public void printDesc(){
        System.out.println("체력을 채워주니다");
    }

}

class Map extends Item{
    public void printDesc(){
        System.out.println("지도를 확장해줍니다");
    }

}
