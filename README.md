# Quiz 2: Calculator and DateChecker (JUnit 5 + TDD)

A small Java project built with test-driven development (TDD), using JUnit 5 and Maven.

## Requirements

- Java 17 or newer
- Maven 3.9 or newer

## Run the tests

```
mvn test
```

All 32 tests should pass (`Tests run: 32, Failures: 0, Errors: 0`). In VS Code you can also run them from the Testing panel.

## Project structure

```
src/main/java/quiz2/
  Calculator.java      sum, subtract, multiply, divide, isEven
  Month.java           enum of the twelve calendar months
  DateChecker.java     has31Days(Month)
src/test/java/quiz2/
  CalculatorTest.java
  DateCheckerTest.java
```

## Reflection

So every behavior started with a test that failed, and the tests defined what done meant before any real code was written. So this changed the order I usually think in, instead of writing code first and testing it. When I wrote a test expecting has31Days(null) to throw an IllegalArgumentException, it failed with a NullPointerException instead, which showed me that a Java switch crashes on null and that I needed an explicit check. At first, making the January test pass with just return true felt weird, but it made sense once the April test failed and forced the real rule. The tests pushed the code forward one small step at a time.
