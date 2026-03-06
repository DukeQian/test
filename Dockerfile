FROM registry.cn-hangzhou.aliyuncs.com/xfg-studio/openjdk:8-jre-slim

LABEL authors="duke"

# 配置
ENV PARAMS=""

# 时区
ENV TZ=PRC
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

# 添加应用
ADD /test-1.0-SNAPSHOT.jar /test-1.0-SNAPSHOT.jar

ENTRYPOINT ["sh","-c","java -jar $JAVA_OPTS /test-1.0-SNAPSHOT.jar $PARAMS"]
