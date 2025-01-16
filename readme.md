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

Inside `<weaveDependencies></weaveDependencies>`, you have to provide the artifacts where your designated aspects come from. Additionally, don't forget to include the corresponding dependency. For example:

An exemplary aspect is part of the artifact `method_logging_aspect` in `org.wseresearch` (groupId). Therefore, you should include the following to the `weaveDependencies`:

```
            <weaveDependency>
                <groupId>org.wseresearch</groupId>
                <artifactId>method_logging_aspect</artifactId>
            </weaveDependency>
```
and the dependency:
```
        <dependency>
            <groupId>org.wseresearch</groupId>
            <artifactId>method_logging_aspect</artifactId>
            <version>0.1.0</version>
        </dependency>
```


