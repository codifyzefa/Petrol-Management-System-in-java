public abstract class Person implements Info{

    protected String name;
    protected int age;
    protected String address;
    protected String phoneNo;
    protected String email;

    Person() {
        name = null;
        age = 0;
        address = null;
        phoneNo = null;
    }

    

    public abstract void setter();

    public abstract void update();

    public abstract void display();

}