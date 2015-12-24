# Java source voor Spring Boot

#### Main method voor Spring Boot

Voorbeeld requestmapping:
```java
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus (HttpStatus.OK)
    public void processData(
            @RequestParam() String name,
            @RequestParam() String surName,
            @RequestParam() String streetName,
            @RequestParam() int houseNumber,
            @RequestParam() String zipCode) {

    }
}
```

Voorbeeld voor json:
```java
@RestController
@RequestMapping(value="/users")
public class MyRestController {

    @RequestMapping(value="/{user}", method=RequestMethod.GET)
    public User getUser(@PathVariable Long user) {
        // ...
    }

    @RequestMapping(value="/{user}/customers", method=RequestMethod.GET)
    List<Customer> getUserCustomers(@PathVariable Long user) {
        // ...
    }

    @RequestMapping(value="/{user}", method=RequestMethod.DELETE)
    public User deleteUser(@PathVariable Long user) {
        // ...
    }

}
```
