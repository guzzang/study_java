package weekly3;

public class BusinessContact extends Contact{

    private String company;

    public BusinessContact(String name, String phoneNumber, String company) {
        super(name, phoneNumber);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public void showContacts(){
        System.out.println("이름:" + getName()
                + ", 전화번호:" + getPhoneNumber()
                + ", 회사명:" + getCompany());
    }



}
