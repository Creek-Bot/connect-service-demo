[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Coverage Status](https://coveralls.io/repos/github/Creek-Bot/connect-service-demo/badge.svg?branch=main)](https://coveralls.io/github/Creek-Bot/connect-service-demo?branch=main)
[![build](https://github.com/Creek-Bot/connect-service-demo/actions/workflows/build.yml/badge.svg)](https://github.com/Creek-Bot/connect-service-demo/actions/workflows/build.yml)
[![CodeQL](https://github.com/Creek-Bot/connect-service-demo/actions/workflows/codeql.yml/badge.svg)](https://github.com/Creek-Bot/connect-service-demo/actions/workflows/codeql.yml)

# Basic Kafka Streams Demo

Repo containing the completed [Basic Kafka Streams demo](https://www.creekservice.org/connect-service-demo)
and associated [docs](docs/README.md).

This repository is also a template repository to enable later tutorials, that build on this one. 
Click the [Use this template](https://github.com/Creek-Bot/connect-service-demo/generate) button at the top to create a new repository from this template.

## Contributing

Contributions welcome!  Please fork, change and raise a PR.

### Gradle commands

* `./gradlew` should be the go-to local command to run when developing.
              It will run `./gradlew format`, `./gradlew static` and `./gradlew check`.
* `./gradlew format` will format the code using [Spotless][spotless].
* `./gradlew static` will run static code analysis, i.e. [Spotbugs][spotbugs] and [Checkstyle][checkstyle].
* `./gradlew check` will run all checks and tests.
* `./gradlew coverage` will generate a cross-module [Jacoco][jacoco] coverage report.

[spotless]: https://github.com/diffplug/spotless
[spotbugs]: https://spotbugs.github.io/
[checkstyle]: https://checkstyle.sourceforge.io/
[jacoco]: https://www.jacoco.org/jacoco/trunk/doc/
