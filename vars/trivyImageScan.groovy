def call(String severity = "HIGH,CRITICAL") {

    def images = sh(
        script: "docker compose config --images",
        returnStdout: true
    ).trim().split('\n')

    images.each { image ->
        echo "Scanning image: ${image}"

        sh """
            trivy image \
                --severity ${severity} \
                --exit-code 1 \
                ${image}
        """
    }
}
