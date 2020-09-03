# Error Handling

It might seem odd to have a section about error handling in clean code. Error handling is just one of those things that we all have to do when we program.

> Error handling is important, but if it obscures logic, it’s wrong


As can be interpreted from the quote, error handling can become a nuisance to writing clean code. You want the logic of the code to be able to shine, and not get bogged down with error handling and interpretation. There are a few general guidelines to follow when deciding how to handle errors.

### Use Exceptions Rather Than Return Codes

The problem with these approaches is that they clutter the caller. The caller must check for errors immediately after the call. Unfortunately, it’s easy to forget. For this reason it is better to throw an exception when you encounter an error. The calling code is cleaner. Its logic is not obscured by error handling.

``` java
public void sendSms() {
    try {
        tryToSendSms();
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}
```


### Use a Finally Block
In contrast to the last few lines of your try block, the finally block gets always executed. That happens either after the successful execution of the try block or after you handled an exception in a catch block. Due to this, you can be sure that you clean up all the opened resources.
``` java
public void closeResourceInFinally() {
    FileInputStream inputStream = null;
    try {
        File file = new File("./tmp.txt");
        inputStream = new FileInputStream(file);
    } catch (FileNotFoundException e) {
        log.error(e);
    } finally {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                log.error(e);
            }
        }
    }
}
```

### Prefer Specific Exceptions
The more specific the exception is that you throw, the better. Always keep in mind that a co-worker who doesn’t know your code, or maybe you in a few months, need to call your method and handle the exception.

Therefore make sure to provide them as many information as possible.

``` java
public void sendSms() {
    try {
        tryToSendSms();
    } catch (Exception e) {
        throw new SmsSendException("Error occurred on send sms", e);
    }
}
```

### Don’t Ignore Exceptions
The developer was probably pretty sure that it would never be thrown and added a catch block that doesn’t handle or logs it. And when you find this block, you most likely even find one of the famous “This will never happen” comments.

``` java
public void doNotIgnoreExceptions() {
    try {
        // do something
    } catch (NumberFormatException e) {
        // this will never happen
    }
}
```

You don’t know how the code will change in the future. Someone might remove the validation that prevented the exceptional event without recognizing that this creates a problem. Or the code that throws the exception gets changed and now throws multiple exceptions of the same class, and the calling code doesn’t prevent all of them.

You should at least write a log message telling everyone that the unthinkable just had happened and that someone needs to check it.


``` java
public void logAnException() {
    try {
        // do something
    } catch (NumberFormatException e) {
        log.error("This should never happen: " + e);
    }
}
```

### Don’t Return Null
 - A caller function dont know what to do when you return null.
 - Better throw an exception, default object, empty list etc.
### Don’t Pass Null

Returning null from methods is bad, but passing null into methods is worse. You should avoid passing null in your code whenever possible.