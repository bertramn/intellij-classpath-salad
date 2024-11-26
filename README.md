# Classpath Salad in IntelliJ

As a maven project it works fine

```shell
mvn clean install -U
```

Loaded in intellij the maven project seems to miss-understand the Saxon-HE project and it's artifacts.

**Expected:**

Maven: `ATTACHED-JAR: com.example.intellij:Saxon-HE:1.0.0-SNAPSHOT`

Classes: `[path]/intellij-classpath-salad/saxon-he/target/modules/Saxon-HE-12.5.jar`
Sources: `[path]/intellij-classpath-salad/saxon-he/target/modules/Saxon-HE-12.5-sources.jar`

**Actual:**

Maven: `ATTACHED-JAR: com.example.intellij:Saxon-HE:1.0.0-SNAPSHOT`

Classes: `[path]/intellij-classpath-salad/saxon-he/target/modules/Saxon-HE-12.5-xqj-sources.jar`
         `[path]/intellij-classpath-salad/saxon-he/target/modules/Saxon-HE-12.5-xqj.jar`

Sources: `[path]/intellij-classpath-salad/saxon-he/target/modules/Saxon-HE-12.5-sources.jar`
