package co.gounplugged.unpluggeddroid.models;

/**
 * Created by pili on 20/03/15.
 */
public class Contact extends Mask {
    public static final String DEFAULT_CONTACT_NUMBER = "3016864576";

    public String getName() {
        return name;
    }

    private String name;

    public Contact(String name, String phoneNumber) {
        super(phoneNumber);
        this.name = name;
    }
}
