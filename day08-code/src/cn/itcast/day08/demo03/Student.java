package cn.itcast.day08.demo03;

public class Student {
    private int id;//学号
    private String name;//姓名
    private int age;//年龄
    private static String room;//教室
    private static int idCounter = 0;//学号计数器，每当new了一个对象的时候，计数器++

    public Student() {
        this.id = ++idCounter;
    }

    /**
     * Gets the value of id. *
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id. *
     * <p>You can use getId() to get the value of id</p>
     * * @param id id
     */
    public void setId( int id ) {
        this.id = id;
    }

    /**
     * Gets the value of room. *
     *
     * @return the value of room
     */
    public static String getRoom() {
        return room;
    }

    /**
     * Sets the room. *
     * <p>You can use getRoom() to get the value of room</p>
     * * @param room room
     */
    public static void setRoom( String room ) {
        Student.room = room;
    }

    /**
     * Gets the value of idCounter. *
     *
     * @return the value of idCounter
     */
    public static int getIdCounter() {
        return idCounter;
    }

    /**
     * Sets the idCounter. *
     * <p>You can use getIdCounter() to get the value of idCounter</p>
     * * @param idCounter idCounter
     */
    public static void setIdCounter( int idCounter ) {
        Student.idCounter = idCounter;
    }

    public Student( String name, int age ) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    /**
     * Gets the value of name. *
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name. *
     * <p>You can use getName() to get the value of name</p>
     * * @param name name
     */
    public void setName( String name ) {
        this.name = name;
    }

    /**
     * Gets the value of age. *
     *
     * @return the value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age. *
     * <p>You can use getAge() to get the value of age</p>
     * * @param age age
     */
    public void setAge( int age ) {
        this.age = age;
    }
}
