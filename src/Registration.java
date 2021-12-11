import newException.InvalidCountryException;

public class Registration {
    public void registerUser(String username,String userCountry) throws InvalidCountryException{
        if (userCountry.equals("India"))
            System.out.println("User registration done successfully");
        else{
            throw new InvalidCountryException("User outside India cannot be registered");
        }
    }

    public static void main(String[] args) {
        Registration obj = new Registration();
        try{
            obj.registerUser("Mickey","UK");
        }
        catch (InvalidCountryException e){
            System.out.println(e.getMessage());
        }
    }
}
