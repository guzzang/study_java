package weekly3;

public class Contact {
    private String name;

    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void showContacts(){
        System.out.println("이름:" + getName()
                + ", 전화번호:" + getPhoneNumber());
    }
}
