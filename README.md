[![CI](https://github.com/tkgregory/gradle-github-actions-example/actions/workflows/gradle.yml/badge.svg)](https://github.com/tkgregory/gradle-github-actions-example/actions/workflows/gradle.yml)

## Overview

This project explores the different ways to build Gradle projects using GitHub actions.

1. No caching
2. Using the *setup-java* Gradle caching mechanism
3. Using the *gradle-build-action* Gradle caching mechanism

## Building

This is a small Java project which can be built with `./gradlew build`.

The project has multiple dependencies that get downloaded from Maven Central. This means that some difference in build times should be noted with caching
enabled vs. disabled.

## Viewing the results

The project includes a single [workflow](/.github/workflows/gradle.yml) which executes the above 3 scenarios. 

See *[Actions](https://github.com/tkgregory/gradle-github-actions-example/actions)* for all the results.Minor change
Minor change
