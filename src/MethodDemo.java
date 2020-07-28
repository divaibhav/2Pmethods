/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 28-Jul-20
 *  Time: 10:07 AM
 */
//create a method to display hello world.
// will understand the process of calling a method

public class MethodDemo {
    public static void main(String[] args) {
        System.out.println("demo method declaring and calling");
        //calling a method
        MethodDemo object = new MethodDemo();
        //calling a method
        object.display();
        System.out.println("exiting app");
    }
    //declaring and defining our method
    //qualifier properties returnType name (parameter list){
    // statements
    // }
    public void display(){
        // action to print hello world
        System.out.println("hello world");
    }
}
