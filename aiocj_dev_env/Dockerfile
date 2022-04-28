FROM consol/ubuntu-icewm-vnc

USER 0

RUN apt-get update && apt-get install -y software-properties-common
RUN add-apt-repository ppa:openjdk-r/ppa -y
RUN apt-get update && apt-get install -y sudo openjdk-17-jdk

RUN wget https://eclipse.mirror.garr.it/technology/epp/downloads/release/2022-03/R/eclipse-modeling-2022-03-R-linux-gtk-x86_64.tar.gz -O /tmp/eclipse.tar.gz -q && \
    echo 'Installing eclipse' && \
    tar -xf /tmp/eclipse.tar.gz -C /opt && \
    rm /tmp/eclipse.tar.gz

ENV VNC_RESOLUTION=1920x1200

ADD run /usr/local/bin/eclipse
RUN chmod +x /usr/local/bin/eclipse