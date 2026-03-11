
# GraphQL Spring Boot Starter
This is a Spring Boot Starter for GraphQL. It provides an easy way to set up a GraphQL server using Spring Boot.


### To use it, add the following dependency to your build.gradle file:]()

```groovy
dependencies {
    implementation 'com.graphql-java-kickstart:graphql-spring-boot-starter:11.1.0'
}

```
### Then, create a GraphQL schema file in the `src/main/resources/graphql` folder. For example, you can create a file named `schema.graphqls` with the following content:

```graphql
type Query {
    hello: String
}
``` 
### Next, create a resolver for the `hello` query. You can do this by creating a new class that implements the `GraphQLQueryResolver` interface. For example:

```java
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Controller
public class Query  {
    @QueryMapping
    public String hello() {
        return "Hello, World!";
    }
}
```    
### Finally, you can run your Spring Boot application and access the GraphQL endpoint at `http://localhost:8080/graphql`. You can use a GraphQL client to send a query like this:

```graphql
query {
    hello
}
```
### And you should receive a response like this:```json
{
    "data": {
        "hello": "Hello, World!"
    }
}```    


### By Default it will check for schema.graphqls in resoucre/graphql folder

### By Default graphql will be added to query url

### GraphiQL path http://localhost:8080/workingWithGraphQL/v1/graphiql?path=/workingWithGraphQL/v1/graphql
