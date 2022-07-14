[![LGPL 2.1](https://img.shields.io/badge/License-LGPL_2.1-blue.svg)](https://www.gnu.org/licenses/old-licenses/lgpl-2.1.html)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.tagtraum/japlsa/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.tagtraum/japlsa)
[![Build and Test](https://github.com/japlscript/japlsa/workflows/Build%20and%20Test/badge.svg)](https://github.com/japlscript/japlsa/actions)


# JaplSA

*JaplSA* is a Java API for the AppleScript Standard Additions based on
[JaplScript](https://github.com/japlscript/japlscript).


## Installation

JaplSA is released via [Maven](https://maven.apache.org).
You can install it via the following dependency:

```xml
<dependency>
    <groupId>com.tagtraum</groupId>
    <artifactId>japlsa</artifactId>
</dependency>
```

The Maven artifacts also contain sources and javadocs. 

If you are using [modules](https://en.wikipedia.org/wiki/Java_Platform_Module_System),
its name is `tagtraum.japlsa`.


## Usage
                           
To use the generated code, do something like this:

```java
import com.tagtraum.macos.standardadditions.ScriptingAddition;

public class DoubleBeep {

    public static void main(final String[] args) {
        final ScriptingAddition scriptingAddition = ScriptingAddition.getInstance();
        scriptingAddition.beep(2);
    }
}
```
              
Or this:

```java
import com.tagtraum.macos.standardadditions.ScriptingAddition;
import java.awt.Color;

public class GetColor {

    public static void main(final String[] args) {
        final ScriptingAddition scriptingAddition = ScriptingAddition.getInstance();
        // show color picker dialog with RED as default color
        final Color color = scriptingAddition.chooseColor(Color.RED);
        System.out.println(color);
    }
}
```
## API

You can find the complete [API here](https://japlscript.github.io/japlsa/com/tagtraum/macos/standardadditions/package-summary.html). 


## Shipping

For information about shipping apps with this library, please see
the corresponding notes about signing, notarization etc. in the
[JaplScript documentation](https://github.com/japlscript/japlscript/blob/main/README.md).
