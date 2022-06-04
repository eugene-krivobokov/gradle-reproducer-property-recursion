apply<SamplePlugin>()

val propertyB = "B"

configure<SampleExtension> {
    propertyA.set("A")
    propertyB.set(propertyB)
}