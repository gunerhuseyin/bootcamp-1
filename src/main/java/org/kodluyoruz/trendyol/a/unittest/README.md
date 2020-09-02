# Unit Test

A unit is an individual part which can also become a component of a larger system. In Java world, a unit can be a method or a class. Unit testing is a level of software testing where methods and classes are tested so that every unit of the software works as designed.

### Unit Testing Benefits
 - Unit testing increases confidence in changing/ maintaining code. If good unit tests are written and if they are run every time any code is changed, we will be able to promptly catch any defects introduced due to the change
 - Codes are more reusable. In order to make unit testing possible, codes need to be modular. This means that codes are easier to reuse.
 - The cost of fixing a defect detected during unit testing is lesser in comparison to that of defects detected at higher levels. Compare the cost (time, effort, destruction, humiliation) of a defect detected during acceptance testing or when the software is in production.
 - Codes are more reliable.
 
Only one assertion should be made per test. While this can create a lot of duplicate code, the template method pattern can be implemented to reduce this duplication by separating the given/when parts of the base class from the then. It is ok to use multiple assert statements.

Each test should cover a single concept, a single when/then per test. Just like with methods, unit tests should do one thing only.

Clean tests should follow **F.I.R.S.T** rules:

 - **Fast** Test should be fast
 - **Independient** Test should not depend on each other
 - **Repeatable** Test Should be repeatable in any environment
 - **Self-Validating** Test should have a boolean output. either they pass or fail
 - **Timely** Unit tests should be written just before the production code that makes them pass. If you write tests after the production code, then you may find the production code to be hard to test
