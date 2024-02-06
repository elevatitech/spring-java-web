# spring-java-web
Sprint Framework Boilerplate with: Spring Boot, Spring Data, Http Client, SpringMVC, Beans, Hibernate, Bootstrap CSS.

# Getting Started

Clone the repo
<pre>git clone https://github.com/elevatitech/spring-boot-java-web.git </pre>

or just Download it
<pre>https://github.com/elevatitech/spring-boot-java-web/archive/master.zip</pre>

### Prerequisites
The required tools are part for the project. (Maven, etc)

### Configuration
The mysql configuration can be updated in the src/main/resources/application.properties file. or you can use hbase by changing the spring.datasource url<br />
Create a database name "logistics" or change it in properties file.
<pre>$ vi src/main/resources/application.properties</pre>

### Installing
The dependencies are defined in the pom.xml file.
<pre>$ ./mvnw install  or  $ ./mvnw clean install</pre>

### Running
Once the dependencies are successfully installed and built, Compile and Run the project.
<pre>./mvnw spring-boot:run</pre>

### Output
This will compile and Start the web application. Check the Output in a web browser.
<pre>$ firefox http://localhost:8080/</pre>
        


### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.1.RELEASE/maven-plugin/)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.2.1.RELEASE/reference/htmlsingle/#using-boot-devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.2.1.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Rest Repositories](https://docs.spring.io/spring-boot/docs/2.2.1.RELEASE/reference/htmlsingle/#howto-use-exposing-spring-data-repositories-rest-endpoint)
* [Thymeleaf Templates](https://docs.spring.io/spring-boot/docs/2.2.1.RELEASE/reference/htmlsingle/#boot-features-spring-mvc-template-engines)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.2.1.RELEASE/reference/htmlsingle/#boot-features-jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

