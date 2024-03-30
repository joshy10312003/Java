import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
    	
        Optional<String> optionalPresent = Optional.of("Hello");
        
        Optional<String> optionalEmpty = Optional.empty();
        
        
        if (optionalPresent.isPresent()) {
            String value = optionalPresent.get();
            System.out.println("Value is present: " + value);
        } else {
            System.out.println("Value is absent.");
        }
        
        String defaultValue = optionalEmpty.orElse("Default Value");
        System.out.println("Default Value: " + defaultValue);
        
        
        String anotherDefaultValue = optionalEmpty.orElseGet(() -> {
            return "Another Default Value";
        });
        System.out.println("Another Default Value: " + anotherDefaultValue);
        
        
        Optional<Integer> optionalLength = optionalPresent.map(String::length);
        optionalLength.ifPresent(length -> System.out.println("Length of the value: " + length));
        
        // Chaining operations
        Optional<Integer> optionalChained = optionalPresent.map(String::length)
                                                            .filter(length -> length > 5);
        optionalChained.ifPresent(length -> System.out.println("Length > 5: " + length));
    }
}
