def call(String installation, String nvdCredentialId) {

    dependencyCheck(
        additionalArguments: '--scan ./ --format XML --format HTML',
        odcInstallation: installation,
        nvdCredentialsId: nvdCredentialId,
        stopBuild: true
    )

    dependencyCheckPublisher(
        pattern: '**/dependency-check-report.xml',
        stopBuild: true
    )
}
