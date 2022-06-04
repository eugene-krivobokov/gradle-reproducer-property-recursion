import java.lang.UnsupportedOperationException
import org.gradle.api.tasks.*
import org.gradle.api.provider.*
import org.gradle.api.*

public abstract class SampleTask : DefaultTask() {

    @get:Input
    public abstract val propertyA: Property<String>

    @get:Input
    public abstract val propertyB: Property<String>

    @TaskAction
    public fun doWork() {
        println("SampleTask: A=${propertyA.get()}, B=${propertyB.get()}")
    }
}