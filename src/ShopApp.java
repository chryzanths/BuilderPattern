public class ShopApp
{
    public static void main(String[] args){

        User user = new User.UserBuilder()
                .firstName("Chryzle")
                .lastName("Amualla")
                .email("chryzle1234@email.com")
                .address("Caratland")
                .phone("091234568")
                .age(22)
                .build();


        System.out.println("First Name: "+ user.firstName);
        System.out.println("Last Name: " + user.lastName);
        System.out.println("Email: " + user.email);
        System.out.println("Address: " + user.address);
        System.out.println("Phone: " + user.phone);
        System.out.println("Age: " + user.age);

    }
}
