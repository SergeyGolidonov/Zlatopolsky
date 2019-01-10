package selfLearn.zlatopolsky.start.testsJava;

public class Main {
    public static MyObject createObject(){
        // BEGIN (write your solution here)
        MyObject myObject = new MyObject();

        myObject.address = myObject.objectInObject.address;
        myObject.apartmentsCount = myObject.objectInObject.apartmentsCount;
        myObject.countOfFloors = myObject.objectInObject.countOfFloors;
        myObject.owner = myObject.objectInObject.owner;

        MyObject returnObject = myObject;
        // END
        return returnObject;
    }
}
