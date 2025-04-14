FROM ubuntu:latest
LABEL authors="aariaz"

ENTRYPOINT ["top", "-b"]