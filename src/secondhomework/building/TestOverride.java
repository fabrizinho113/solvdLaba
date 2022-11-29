package secondhomework.building;

public class TestOverride {


    public static void comparison() {

        Stadium stadiumOne = new Stadium("Camp Nou", 30000);

        Stadium stadiumTwo = new Stadium("Camp Nou", 30000);

        //Stadium stadiumTwo = new Stadium("camp Nou", 30000);
        //Stadium stadiumTwo = new Stadium("Camp Nou", 25000);

        
        //True with Camp Nou - Camp Nou
        //False with cap 30000 - 25000
        if (stadiumOne.equals(stadiumTwo)) {
            System.out.println("Objects have the same content");
        } else {
            System.out.println("Objects don't have the same content");
        }

        //True with Camp Nou - Camp Nou
        //False with cap 30000 - 25000
        if (stadiumOne.hashCode() == stadiumTwo.hashCode()) {
            System.out.println("Hashcode value is the same");
        } else {
            System.out.println("Hashcode value is not the same");
        }

    }
}
