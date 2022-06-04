import org.gradle.api.*
import org.gradle.kotlin.dsl.create

public class SamplePlugin : Plugin<Project> {

    override fun apply(target: Project) {
        val ext = target.extensions.create<SampleExtension>("sample")

        target.tasks.register("sampleTask", SampleTask::class.java) {
            propertyA.set(ext.propertyA)
            propertyB.set(ext.propertyB)
        }
    }
}