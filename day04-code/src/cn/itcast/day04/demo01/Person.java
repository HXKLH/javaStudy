package cn.itcast.day04.demo01;

public class Person {

    private int ID;
    private String Name;
    /**
     * Gets the value of ID. *
     *
     * @return the value of ID
     */
    public int getID() {
        return ID;
    }

    /**
     * Sets the ID. *
     * <p>You can use getID() to get the value of ID</p>
     * * @param ID ID
     */
    public void setID( int ID ) {
        this.ID = ID;
    }

    /**
     * Gets the value of Name. *
     *
     * @return the value of Name
     */
    public String getName() {
        return Name;
    }

    /**
     * Sets the Name. *
     * <p>You can use getName() to get the value of Name</p>
     * * @param Name Name
     */
    public void setName( String name ) {
        Name = name;
    }

    public Person( int ID, String name ) {
        this.ID = ID;
        Name = name;
    }
}


