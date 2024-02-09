public class User
{
    protected final String firstName;
    protected final String lastName;
    protected final String email;
    protected final String address;
    protected final String phone;
    protected final Integer age;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getAge() {
        return age;
    }

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.address = builder.address;
        this.phone = builder.phone;
        this.age = builder.age;


    }

    protected static class UserBuilder{
        private String firstName;
        private String lastName;
        private String email;
        private String address;
        private String phone;
        private Integer age;

        public UserBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public UserBuilder email(String email){
            this.email = email;
            return this;
        }

        public UserBuilder address(String address){
            this.address = address;
            return this;
        }

        public UserBuilder phone(String phone){
            this.phone = phone;
            return this;
        }

        public UserBuilder age(Integer age){
            this.age = age;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
