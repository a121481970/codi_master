FROM mariadb:latest

MAINTAINER  YEYB(yeyanbin@swip.ac.cn)

ENV TZ=Asia/Shanghai

RUN ln -sf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

COPY CODIS.sql /docker-entrypoint-initdb.d

COPY NACOS.sql /docker-entrypoint-initdb.d

EXPOSE 3306