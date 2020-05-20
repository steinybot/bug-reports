FROM amazonlinux:latest AS sdks

# These are required for SDKMAN.
# `which` should not be required but it is.
# See https://github.com/sdkman/sdkman-cli/issues/759.
RUN yum install -y \
  gzip \
  tar \
  unzip \
  which \
  zip

RUN touch "/root/.bashrc"

RUN curl -s 'https://raw.githubusercontent.com/nvm-sh/nvm/v0.35.3/install.sh' | bash

# The version isn't a real parameter but it serves to invalidate the cache.
RUN curl -s 'https://get.sdkman.io?version=5.8.1' | bash

COPY '.nvmrc' '.nvmrc'
COPY '.sdkmanrc' '.sdkmanrc'

RUN source "/root/.bashrc" && nvm install

RUN source "/root/.bashrc" && sdk install java '14.0.1.hs-adpt'
RUN source "/root/.bashrc" && sdk install sbt
# This just double checks that the versions are the same as the .sdkmanrc file.
RUN source "/root/.bashrc" && sdk env


FROM amazonlinux:latest

RUN yum install -y \
  curl \
  git \
  openssh

COPY --from=sdks '/root/.nvm' '/root/.nvm'
COPY --from=sdks '/root/.sdkman' '/root/.sdkman'
COPY --from=sdks '/root/.bashrc' '/root/.bashrc'
COPY --from=sdks '.nvmrc' '.nvmrc'
COPY --from=sdks '.sdkmanrc' '.sdkmanrc'

RUN source "/root/.bashrc" && npm install -g @aws-amplify/cli@4.18.1

COPY '*.sbt' .
COPY 'project' 'project'

RUN source "/root/.bashrc" && \
  nvm use && \
  sdk env && \
  sbt update Test/update npmUpdate Test/npmUpdate
