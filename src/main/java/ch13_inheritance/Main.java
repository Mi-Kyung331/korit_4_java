package ch13_inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.setAnimalName("나비");
        animal1.setAnimalAge(1);
        animal1.move();

        Tiger tiger1 = new Tiger();
        tiger1.setAnimalName("푸바오");
        tiger1.setAnimalAge(3);
        tiger1.move();
        tiger1.hunt();
//        animal1.hunt(); 오류발생 → 부모클래스는 자식클래스의 필드 및 메서드에 접근 불가

        tiger1.setStriped(true);
//        animal1.setStripted(false); 오류 발생 -> 16번 라인과 동일한 이유로

        Human human1 = new Human();
        human1.setAnimalName("강미경");
        human1.setAnimalAge(25);
        System.out.println(human1.getAnimalName());
        human1.getAnimalAge();
        human1.move();
        human1.read("자바의 기초");

    }
}
