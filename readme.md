# Method Logging Aspects

## Goal
This repository serves as a "library" for several aspects and several purposes. Its recommended to use it along with the aspectj plugin (see further instructions).

### Set up project to include aspects

To use any of the aspects provided in this repository, you just need to add the following plugin to your pom.xml (Use a search engine of your choice for gradle).

```
<plugin>
    <groupId>org.codehaus.mojo</groupId>
    <artifactId>aspectj-maven-plugin</artifactId>
    <version>1.14.0</version>
    <configuration>
        <complianceLevel>1.8</complianceLevel>
        <source>1.8</source>
        <target>1.8</target>
        <weaveDependencies>
            <weaveDependency>
                <groupId>eu.wdaqua.qanary</groupId>
                <artifactId>qa.commons</artifactId>
            </weaveDependency>
        </weaveDependencies>
        <verbose>true</verbose>
        <showWeaveInfo>true</showWeaveInfo>
    </configuration>
    <executions>
        <execution>
            <goals>
                <goal>compile</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```