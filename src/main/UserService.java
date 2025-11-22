package main;

public class UserService {

    public String format(User user) {
        String s =
            user.getProfile()
                .getAddress()
                .getStreet()
public String format(User user) {
        String s = null;
        if (user != null && user.getProfile() != null && user.getProfile().getAddress() != null && user.getProfile().getAddress().getStreet() != null) {
            s = user.getProfile()
                .getAddress()
                .getStreet()
                .trim();
        }
        return (s != null) ? s.toUpperCase() : "";
    }
        return s.toUpperCase();
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