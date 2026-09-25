def call(String installation, String nvdCredentialId) {

    dependencyCheck(
        additionalArguments: '--scan ./ --data /opt/dependency-check-data',
        odcInstallation: installation,
        nvdCredentialsId: nvdCredentialId,
        stopBuild: true
    )

    dependencyCheckPublisher(
        pattern: '**/dependency-check-report.xml'
    )
}
