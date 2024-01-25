# fetch-win10

This is a small piece of my upcoming project, Mutjo. It basically consists of a program similar to neofetch but with Windows 10/11.

*Note: Some terminals may not support the added green tint of the text.*

# What it does

What does sysspecs/fetch-win10 do? It's simple. It "fetches" information about your computer through the ```System.getProperty()``` function and through these two Java packages:

```
import java.lang.management.ManagementFactory
import com.sun.management.OperatingSystemMXBean
```
from these a variable is made: ```val osBean = ManagementFactory.getOperatingSystemMXBean() as OperatingSystemMXBean``` to extract the remaining memory of the device and the total memory on the device. In order to format the bytes of the remaining memory and the total memory available to human-readable numbers, (GiBs), a external package is imported:

```
import mutjoCORE.mutjoCORE1
```
and
```
val mutjo = mutjoCORE1()
```
The function used from this package is called ```formatBytes()```. I think thats all I can explain about the software, so you are sure no malicious things get in your computer.

# Compatibilty Notices

Please note that ```com.sun.management.OperatingSystemMXBean``` may not work on your version of Java. As well, 
```java.lang.management.ManagementFactory``` was probably, from what I could find, was added in Java 1.5. So, if your somehow using that version of Java, or less, it may not work.
