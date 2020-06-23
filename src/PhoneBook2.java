import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PhoneBook2 implements PhoneBook1 {

    private   final Map<String, Set<String>> phonesByName = new TreeMap<>();

    @Override
    public void add (String name, String phoneNumber){
        Set<String> phones = getPhones(name);
        phones.add(phoneNumber);
    }


    private Set<String> getPhones (String name){
        return phonesByName.computeIfAbsent(name, key ->new HashSet<>());
    }

    @Override
    public Set<String> get(String name) {
        return getPhones(name);
    }

    @Override
    public Set<String> getAllName() {
        return phonesByName.keySet();
    }

}
