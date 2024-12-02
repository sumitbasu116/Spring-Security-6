# Use Case

> Secure the application apis by using latest Spring Security i.e. version 6.

# Concept of basic Authentication of an API:
> Whenever we verify to access an API with username and password, a "SessionID" is generated. Each subsequent API calls on the same client or browser will not have to verify anymore as it will pass the SessionID created at the previous step.

> If we change the client, the session ID will not present, so, we again need to login or authenticate.

**Basic Authetication Flow:**
 Client --> Filters [Filter1,Filter2,Spring-Security-Filter,...] --> Dispatcher Servlet --> Controller

# Authentication of an GET and POST API:
> To autheticate a GET endpoint, we need to pass only SessionID in the header of that API request from a Client.
> To verify a POST endpoint, we need to pass SessionID and **csrf_token** in the header of that API request from a Client.

## Who generates this csrf_token?
> csrf_token is a hidden field generated at the time of when the SessionID got generated or at the time of authentication. Attacker can get the Session ID as it is visible.
> However, the csrf_token is a hiddle field in the form, so Attacker can not see it from outside the client machine. This way csrf attack can be prevented for the POST,PUT, DELETE request.

# Components of Spring Security
> Filter Chain has Authentication Filter. Authentication Filter has the Security context. Authentication Manager is calling Authentication filter to get the Authentication Provider.

# Security Context
> The Security Context holds the security information (e.g., authenticated user details) for the current request.
> It is stored in a thread-local variable and is accessible globally within the request's lifecycle.
