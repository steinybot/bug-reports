pwd
ls -la
exit
cd ~
ls -la
dockerd -D -l debug &>dockerd-logfile.txt &
DOCKER_BUILDKIT=1 docker build --build-arg BUILDKIT_INLINE_CACHE=1 .
DOCKER_BUILDKIT=1 docker build --build-arg BUILDKIT_INLINE_CACHE=1 .
DOCKER_BUILDKIT=1 docker build   --build-arg BUILDKIT_INLINE_CACHE=1   --cache-from "community-build-image:latest"   --file docker/Dockerfile   --tag "community-build-image:latest"   .
exit
cd ~
DOCKER_BUILDKIT=1 docker build   --build-arg BUILDKIT_INLINE_CACHE=1   --cache-from "community-build-image:latest"   --file docker/Dockerfile   --tag "community-build-image:latest" \
DOCKER_BUILDKIT=1 docker build --build-arg BUILDKIT_INLINE_CACHE=1 --cache-from "community-build-image:latest" --tag "community-build-image:latest" .
exit
cd ~
dockerd -D -l debug &>dockerd-logfile.txt &
docker ps -a
docker ls
docker image ls
dockerd -D -l debug &>dockerd-logfile.txt &
DOCKER_BUILDKIT=1 docker build --build-arg BUILDKIT_INLINE_CACHE=1 --cache-from "community-build-image:latest" --tag "community-build-image:latest" .
DOCKER_BUILDKIT=1 docker build --build-arg BUILDKIT_INLINE_CACHE=1 --cache-from "community-build-image:latest" --tag "community-build-image:latest" .
exit
