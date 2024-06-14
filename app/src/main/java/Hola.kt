import kotlinx.coroutines.*


fun main() {
    runBlocking {

        println("Main program STARTS: ${Thread.currentThread().name}")

        val jobDeferred:Deferred<Int> = async {
            println("Fake work starts: ${Thread.currentThread().name}")
            delay(10000)
            println("Fake work finished: ${Thread.currentThread().name}")
            15
        }

        // delay(200)
        val num:Int = jobDeferred.await()
        println("$num Main program ENDS: ${Thread.currentThread().name}")
    }



   /* runBlocking {

        println("Main program STARTS: ${Thread.currentThread().name}")

        val job:Job = launch {
            println("Fake work starts: ${Thread.currentThread().name}")
            delay(10000)
            println("Fake work finished: ${Thread.currentThread().name}")
        }

       // delay(200)
        job.join()
        println("Main program ENDS: ${Thread.currentThread().name}")
    }*/
}