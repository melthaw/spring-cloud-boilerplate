from clouthinkin/jre

ADD build/libs/gateway-0.1.0-SNAPSHOT.jar /
ADD container_files/ /

RUN chmod +x /*.sh

EXPOSE 8080
EXPOSE 8090
WORKDIR /
ENTRYPOINT /docker-entrypoint.sh
