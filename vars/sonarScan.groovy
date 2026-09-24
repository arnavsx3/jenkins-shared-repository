def call(String sonarServer, String projectKey) {
    withSonarQubeEnv(sonarServer) {
        sh """
            docker run --rm \
                --network devsecops \
                -v "\$WORKSPACE:/usr/src" \
                -e SONAR_HOST_URL="\$SONAR_HOST_URL" \
                -e SONAR_TOKEN="\$SONAR_AUTH_TOKEN" \
                sonarsource/sonar-scanner-cli:12.2 \
                -Dsonar.projectKey=${projectKey} \
                -Dsonar.sources=/usr/src
        """
    }
}
