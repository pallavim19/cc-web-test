# Check24 Credit Card Automation Project
=================
The project is build in [Serenity](https://github.com/serenity-bdd/serenity-core), [Selinium](https://www.selenium.dev/) and [Maven](https://maven.apache.org/)

The project covers testing scenarios to apply credit card which appears first in the panel.

Also, covers the test to submit form without data to verify error message.

The tests are executed in parallel with 2 threads as default.

To run the tests in a specific browser, e.g. chrome:

```
mvn verify -Dwebdriver.driver=chrome -Dwebdriver.chrome.driver=/opt/dev/chromedriver
```

To use default webdriver:

```
mvn verify
```

Test Report Details

maven command

```
mvn serenity:aggregate
```

report location

```
<code>/target/site/serenity/index.html
```
