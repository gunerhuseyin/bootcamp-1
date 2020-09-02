# Functions

A Function should do one thing only and do it really well.

How can we have write a good function/method? This is the list of the features that a function must have to be considered “good”:

- Small
- Do one thing
- Have no side effects
- Use descriptive names
- Low number of arguments
- Command Query Separation
- Prefer exception to returning error codes
- Don’t repeat yourself

Let’s go deeper in the details of each one of these features.

### Small
The first rule of functions is that they should be small. The second rule of functions is that they should be smaller than that.
Functions should not be 100 lines long. Functions should hardly ever be 20 lines long.
To write such small function you have to follow some simple rules:
 - the body of every if else must be of one line (most of the time a call to another function)
 - the body of every for loop must be of one line (most of the time a call to another function)
 - the body of every while loop must be of one line (most of the time a call to another function)
 - no nested structure


### Do one thing
> FUNCTIONS SHOULD DO ONE THING. THEY SHOULD DO IT WELL. THEY SHOULD DO IT ONLY.

How can we be sure that a function does just one thing? Way to know that a function is doing more than “one thing” is if you can extract another function from it with a name that is not merely a restatement of its implementation.

### Have no side effects
This is a consequence of the fact that our function should do one thing. Our function should not generate side effects when it is executed.

``` java
public class UserValidator {
    private Cryptographer cryptographer;
    public boolean checkPassword(String userName, String password) {
        User user = UserGateway.findByName(userName);
        if (user != User.NULL) {
            String codedPhrase = user.getPhraseEncodedByPassword();
            String phrase = cryptographer.decrypt(codedPhrase, password);
            if ("Valid Password".equals(phrase)) {
                Session.initialize();
                return true;
            }
        }
        return false;
    }
}
```
The side effect is the call to Session.initialize(). The *checkPassword()* function, by its name, says that it checks the password. The name does not imply that it initializes the session. So a caller who believes what the name of the function says runs the risk of erasing the existing session data when he or she decides to check the validity of the user.

In particular our functions should not:

- create temporal coupling with other function by silently modifying states/other properties
- use output arguments

### Use descriptive names

Don’t be afraid to make a name long. A long descriptive name is better than a short enigmatic name. Use a naming convention that allows multiple words to be easily read in the function names, and then make use of those multiple words to give the function a name that says what it does.

Don’t be afraid to spend time choosing a name. Indeed, you should try several different names and read the code with each in place.

Be consistent in your names. Use the same phrases, nouns, and verbs in the function names you choose for your modules. For example, *setAsShipped()*, *setAsDelivered()*

### Low number of arguments
The ideal number of arguments for a function is zero (niladic). Next comes one (monadic), followed closely by two (dyadic). Three arguments (triadic) should be avoided where possible. More than three (polyadic) requires very special justification—and then shouldn’t be used anyway.
When the number of arguments start to growth to more than 3 arguments it is possible wrap them in specific class that describe better their meaning. This kind of classes are called argument objects. 

Let’s see below code snippet:
``` java
// Simple version
Circle makeCircle(double x, double y, double radius);

/// With arguments objects
Circle makeCircle(Point center, double radius);
```
Second version of the *makeCircle()* function ismuch more readable and clear.

### Command Query Separation
A function is either a COMMAND that performs an action or a QUERY that returns data to the caller.

Let’s see what Uncle Bob says about the command query separation:

>Functions should either do something or answer something, but not both. Either your function should change the state of an object, or it should return some information about that object. Doing both often leads to confusion.

``` java
public boolean setAsDelivered() {
    status = "Delivered";
    if (previousStatus.equals("Shipped")) {
        return true;
    }
    return false;
}
```

### Prefer exception to returning error codes

Generally speaking if you need to return an error to a user of your class, try to avoid as much as possible error code. Always use exceptions whenever possible. In this way the user of your class will not abuse of nested if cases to check returned error code from your functions.

### Don't repeat yourself

>Duplication may be the root of all evil in software.

This quote from Uncle Bob’s book is more expressive than any other explanation. Developers can choose from a wide range of programming techniques to avoid duplication in their code. Generally speaking duplication make your code hard to maintain, because often you need to propagate an a modification for a new feature in a lot of different places.
