package Lesson7;

import Lesson6.Car;
import Lesson6.DbConnector;
import Lesson6.User;

public class Demo {

    User user = new User();
    User user1 = new User();
    User user2 = new User();

    User user3 = new User("Jack");

    Car car = new Car(10000, 2015, "Anton");

    DbConnector dbConnector = new DbConnector();


}
