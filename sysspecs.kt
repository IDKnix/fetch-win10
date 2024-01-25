import mutjoCORE.mutjoCORE1
import java.lang.management.ManagementFactory
import com.sun.management.OperatingSystemMXBean

fun main() {
    val mutjo = mutjoCORE1()
    val osBean = ManagementFactory.getOperatingSystemMXBean() as OperatingSystemMXBean
    val reset = "\u001b[0m"
    val green = "\u001b[32m"
    val os = System.getProperty("os.name")
    val osver = System.getProperty("os.version")
    val osarc = System.getProperty("os.arch")
    val java = System.getProperty("java.version")
    val javavendor = System.getProperty("java.vendor")
    val user = System.getProperty("user.name")
    val lang = System.getProperty("user.language")
    val country = System.getProperty("user.country")
    val freeMem = mutjo.formatBytes(osBean.freeMemorySize)
    val totalMem = mutjo.formatBytes(osBean.totalMemorySize)
    println("""$green                  
                NNNNNNNN        NNNNNNNN     SYSSPECS V1.0-2.0
                N:::::::N       N::::::N     
                N::::::N::::::::N::::::N     OS: $os $osver
                N::::::::N      N::::::N     Java: $java ($javavendor)
                N:::::::::N     N::::::N     Architecture: $osarc
                N::::::::::N    N::::::N     CPU Cores: ${osBean.availableProcessors}
                N:::::::::::N   N::::::N     Total Memory Size: $totalMem
                N:::::::N::::N  N::::::N     Free Memory: $freeMem
                N::::::N N::::N N::::::N     Username: $user
                N::::::N  N::::N:::::::N     Language: $lang
                N::::::N   N:::::::::::N     Country: $country
                N::::::N  N::::N:::::::N
                N::::::N   N:::::::::::N
                N::::::N    N::::::::::N
                N::::::N     N:::::::::N
                N::::::N      N::::::::N
                N::::::N       N:::::::N
                N::::::N        N::::::N
                NNNNNNNN         NNNNNNN
                $reset
            """.trimIndent())
}