def call(String sonarServer, String projectKey) {
    withSonarQubeEnv(sonarServer) {
        sh """
            docker run --rm \
                -v "\$WORKSPACE:/usr/src" \
                sonarsource/sonar-scanner-cli:12.2 \
                -Dsonar.projectKey=${projectKey} \
                -Dsonar.sources=/usr/src
        """
    }
}
