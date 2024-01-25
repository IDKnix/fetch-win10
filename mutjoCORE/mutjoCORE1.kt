package mutjoCORE

import java.io.BufferedReader
import java.io.InputStreamReader

class mutjoCORE1 {
    fun Cconvert(celsius: Int) {
        val fahrenheit = (celsius * 9/5) + 32
        println("$celsius°C converted to °F is ~$fahrenheit°F")
    }
    fun Fconvert(fahrenheit: Int) {
        val celsius = (fahrenheit - 32) * 5/9
        println("$fahrenheit°F converted to °C is ~$celsius°C")
    }
    fun FTconvert(feet: Double) {
        val meter = feet * 0.3048
        println("${feet}ft converted to meters is ~${meter}m")
    }
    fun Mconvert(meter: Double) {
        val feet = meter * 3.28084
        println("${meter}m converted to feet is ~${feet}ft")
    }
    fun game(startingShards: Int) {
        var tradeyn: Boolean
        var shards: Int = if (startingShards >= 500) {
            println("Starting shards cannot be over or equal to 500.")
            200
        } else {
            startingShards
        }

        //Calculating Gems
        var gems = shards / 20

        println("Shards Balance: $shards")
        println("For every 20 Shards you have, you get one Gem! You have $gems Gems!")
        Thread.sleep(2000)
        print("Wow! A new SHARD OFFER has appeared! (Lvl 1) You: 100shards and 3gems for Offerer: 120 shards. Accept (y) or Deny? (n) ")
        tradeyn = readln() == "y"
        if (tradeyn) {
            //Taking away the payment
            shards -= 100
            gems -= 3

            //Paying
            shards += 120
            println("Shards Balance: $shards")
            Thread.sleep(400)
            println("Gems Balance: $gems")
        }

    }

    // This is the function used in fetch-win10. All others are used in a seperate project.
    
    fun formatBytes(bytes: Long): String {
        val kilobytes = bytes / 1024
        val megabytes = kilobytes / 1024
        val gigabytes = megabytes / 1024

        return when {
            gigabytes > 0 -> "$gigabytes GiB"
            megabytes > 0 -> "$megabytes MiB"
            kilobytes > 0 -> "$kilobytes KiB"
            else -> "$bytes Bytes"
        }
    }
}
