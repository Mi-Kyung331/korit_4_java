package ch16_objects;

// ObjectTestMain에서 ObjectTest의 객체를 생성하고 이름에 여러분 이름, 주소에 여러분 주소를 입력하고
// displayInfo()를 호출하시오.
public class ObjectTestMain {
    public static void main(String[] args) {
        ObjectTest objectTest1 = new ObjectTest("강미경", "부산광역시 금정구");
        objectTest1.displayInfo();

        System.out.println();

        System.out.println(objectTest1);
    }
}
