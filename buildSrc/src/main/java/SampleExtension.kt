import org.gradle.api.tasks.*
import org.gradle.api.provider.*

public abstract class SampleExtension {

    public abstract val propertyA: Property<String>

    public abstract val propertyB: Property<String>
}