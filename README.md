# Classpath Salad in IntelliJ

As a maven project it works fine

```shell
mvn clean install -U
```

Loaded in intellij the maven project seems to miss-understand the Saxon-HE project and it's artifacts.

Open Project Settings -> Libraries

### Library `ATTACHED-JAR: com.example.intellij:Saxon-HE:1.0.0-SNAPSHOT`

**Expected:**

Classes: 
* `[path]/intellij-classpath-salad/saxon-he/target/modules/Saxon-HE-12.5.jar`

Sources: 
* `[path]/intellij-classpath-salad/saxon-he/target/modules/Saxon-HE-12.5-sources.jar`

**Actual:**

Classes:
* `[path]/intellij-classpath-salad/saxon-he/target/modules/Saxon-HE-12.5-xqj-sources.jar`
* `[path]/intellij-classpath-salad/saxon-he/target/modules/Saxon-HE-12.5-xqj.jar`

Sources:
* `[path]/intellij-classpath-salad/saxon-he/target/modules/Saxon-HE-12.5-sources.jar`


### Library `ATTACHED-JAR: com.example.intellij:Saxon-HE:xqj:1.0.0-SNAPSHOT`

**Expected:**

Classes:
* `[path]/intellij-classpath-salad/saxon-he/target/modules/Saxon-HE-12.5-xjc.jar`

Sources:
* `[path]/intellij-classpath-salad/saxon-he/target/modules/Saxon-HE-12.5-xjc-sources.jar`

**Actual:**

Classes:
* `[path]/intellij-classpath-salad/saxon-he/target/modules/Saxon-HE-12.5-xqj-sources.jar`
* `[path]/intellij-classpath-salad/saxon-he/target/modules/Saxon-HE-12.5-xqj.jar`

Sources:
* `[path]/intellij-classpath-salad/saxon-he/target/modules/Saxon-HE-12.5-sources.jar`