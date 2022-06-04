# Reproducer for property recursion

```shell
./gradlew sampleTask --stacktrace

java.lang.StackOverflowError
        at org.gradle.api.internal.provider.AbstractProperty.getProducer(AbstractProperty.java:174)
        at org.gradle.api.internal.provider.AbstractProperty.getProducer(AbstractProperty.java:178)
        at org.gradle.api.internal.provider.AbstractProperty.getProducer(AbstractProperty.java:178)
        ...
```

See `propertyB` in `build.gradle.kts`.