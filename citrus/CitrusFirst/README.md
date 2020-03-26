# Citrus Integration Testing
https://citrusframework.org/

# Setup with Maven
https://citrusframework.org/docs/setup-maven/

# 1. creating the Citrus Java project
mvn archetype:generate -Dfilter=com.consol.citrus.archetypes:citrus

# 2. Maven commands to compile, package and test the sample.
mvn clean install

# 3. If you just want to execute the Citrus tests with a Maven build execute
mvn clean verify

# 4. You can also execute single test cases by defining the test name as Maven system property.
mvn clean verify -Dit.test=SampleIT

# 5. add a new Citrus test case to our project.
mvn citrus:create-test


# Main example project is citrus-samples

# Maven project structure
https://maven.apache.org/guides/introduction/introduction-to-the-pom.html
