def call(String sonarServer, String projectKey) {
    withSonarQubeEnv(sonarServer) {
        sh """
            \$SONAR_HOME/bin/sonar-scanner \
                -Dsonar.projectKey=${projectKey} \
                -Dsonar.sources=.
        """
    }
}


