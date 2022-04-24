public class Person{

    private String name;
    private String contactNo;
    private Boolean status;
    private static Integer eyeCount = 2;

    public Person(){

    }

    public Person(String name, String contactNo){
        this.name = name;
        this.contactNo = contactNo;
        System.out.println("Current Instance: "+ this);

    }
    public Person(Boolean status, String contactNo){
        this.status = status;
        this.contactNo = contactNo;
    }

    public Person(String contactNo, Boolean status){
        this.status = status;
        this.contactNo = contactNo;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setName(String name1, String name2){

    }

    public String getName(){
        return this.name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + this.name + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", status=" + status +
                '}';
    }
}


