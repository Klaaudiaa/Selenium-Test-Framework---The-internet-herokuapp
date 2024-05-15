### Prerequisites
* **JDK 17** (however that could be probably downgraded)
* **Maven**
* **Lombok** plugin installed (https://projectlombok.org/setup/intellij) 
* **Gherkin** plugin installed 
* **Cucumber for Java** plugin installed 

### How to run

Features(tests) are located at:

src/test/resources/features


Run it from Intellij as usual cucumber scenario or:
* right click on feature file to run all test cases
* go into feature file and run single test from there

or execute suite directly from maven:
* mvn test
* to pick specific suite: mvn test -DsuiteXmlFile=src/test/resources/suites/someSuite.xml

## Results
By default results are located at target/cucumber-reports
