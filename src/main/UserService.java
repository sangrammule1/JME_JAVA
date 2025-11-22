package main;

public class UserService {

    public String format(User user) {
        String s =
            user.getProfile()
                .getAddress()
                .getStreet()
.trim()
    }
    
    public static void main(String[] args) {
		UserService userService = new UserService();
		Address address = new Address(null);
		Profile profile = new Profile(address);
		User user = new User(profile);
		String format = userService.format(user);
		System.out.println(format);
	}
}