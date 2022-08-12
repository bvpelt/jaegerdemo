# Jaeger demo

# Build
Make shure docker-setup.sh is executable

```shell
# ./docker-setup.sh
```

# Usage
After build which starts the necessary docker images, go to [jaeger-ui](localhost:9090) to view jaeger tracing. If no request are made nothing except error message will show.

Then [make some requests](http://localhost:8080/api/v1/names/random) to generate jaeger tracing data.

# Upgrade
Upgraded to recent packages.
Had to use a [workaround](https://github.com/opentracing-contrib/java-spring-cloud/issues/312)
# References
- [example description](https://medium.com/xebia-engineering/jaeger-integration-with-spring-boot-application-3c6ec4a96a6f)
- [example source code from github](https://github.com/himankbatra/opentracing-microservices-example/tree/master/animal-name-service)
- [find maven dependencies](https://repository.sonatype.org/#welcome)
- [resolving dependency conflicts](https://dzone.com/articles/solving-dependency-conflicts-in-maven)