1. Begin by building the provided extension on your local machine using the command 
```bash
mvn clean install
```

2. Next, integrate the extension into your user application by adding the appropriate 
Maven dependency to your project's configuration:

`````xml
<dependency>
  <groupId>quarkus.extensions.demo</groupId>
  <artifactId>runtime</artifactId>
  <version>0.0.1-SNAPSHOT</version>
</dependency>
`````
3. When you execute your user application, the console should display the following message:

If you run the user application in test mode, you will observe:
```bash
The current class implementation is: demo.runtime.impl.DemoProviderImpl, with profile mode: TEST."
```
instead, 
```bash
The current class implementation is: demo.runtime.impl.DemoCustomProvider, with profile mode: TEST.
```