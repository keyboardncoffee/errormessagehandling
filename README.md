### Error and Exception Message Handler
A minimal Java/Spring Boot library for structured and reusable error and exception messaging. Designed to eliminate boilerplate when handling exceptions by providing a consistent 
ErrorResponse object and simplified BaseException types, with zero reliance on annotations.

Note: This library is not intended for field validation - it focuses solely on exception definition, management, and delivery.

### FEATURES
* Drop-in exception classes like NotFoundException, ConflictException, etc.
* Central ErrorResponseFactory to generate timestamped error messages
* No annotations required (but works seamlessly in Spring Boot)
* Works in non-Spring, plain Java projects too
* Compatible with Maven and Gradle
* Cleaner and more testable exception code

### INSTALLATION
* Maven

```

<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>

<dependency>
  <groupId>com.github.keyboardncoffee</groupId>
  <artifactId>errormessagehandler</artifactId>
  <version>v1.0.0</version>
</dependency>


```

### gradle

```

repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.keyboardncoffee:errormessagehandler:v1.0.0'
}

```

### BASIC USAGE
1. Throw a custom exception

```
throw new ConflictException("Username already exists");

```
2. Catch and convert to response

```

catch (BaseException ex) {
    ErrorResponse response = ErrorResponseFactory.from(ex);
}


```

### EXAMPLE: Usage in Spring Boot Project

Add to your controller (no annotations required):

```

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final Set<String> usernames = new HashSet<>();

    @PostMapping
    public ResponseEntity<?> createUser(@RequestParam String username) {
        try {
            if (usernames.contains(username)) {
                throw new ConflictException("Username already exists: " + username);
            }

            usernames.add(username);
            return ResponseEntity.status(HttpStatus.CREATED).body("User created");
        } catch (BaseException ex) {
            ErrorResponse error = ErrorResponseFactory.from(ex);
            return ResponseEntity.status(HttpStatus.CONFLICT).body(error);
        } catch (Exception ex) {
            ErrorResponse error = ErrorResponseFactory.generic();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
        }
    }
}


```

### Sample Error Response (JSON)

```

{
  "code": "ERR-409",
  "message": "Username already exists: tega",
  "timestamp": "2025-07-30T16:21:55.412Z"
}

```

### Custom Exceptions provided

All extend BaseException

```

| Exception                        | Error Code | Use Case                          |
| -------------------------------- | ---------- | --------------------------------- |
| `ConflictException`              | `ERR-409`  | Resource already exists           |
| `ResourceNotFoundException`      | `ERR-404`  | Missing entity                    |
| `UnauthorizedAccessException`    | `ERR-401`  | User not authenticated            |
| `ValidationFailureException`     | `ERR-400`  | Invalid input                     |
| `ServiceUnavailableException`    | `ERR-503`  | External/internal service failure |
| `BusinessRuleViolationException` | `ERR-422`  | Domain-specific logic violations  |

````

### TEST

```
mvn clean test

```

### LICENSE

This project is licensed under the MIT License.

