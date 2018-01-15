#!/bin/bash -e

APP_VERSION=${APP_VERSION:-"1.0.0-SNAPSHOT"}

echo "Using JAVA_OPTS=$JAVA_OPTS"
echo "CMD Args: $@"

java $JAVA_OPTS -jar "/discovery-${APP_VERSION}.jar" "$@"
