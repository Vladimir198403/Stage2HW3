import java.util.Set;

    public interface PhoneBook1{
        void add(String name, String phoneNumber);

        Set<String> get(String name);

        Set<String> getAllName();
    }

